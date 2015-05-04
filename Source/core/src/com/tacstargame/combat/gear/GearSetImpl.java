package com.tacstargame.combat.gear;

import java.util.HashMap;
import java.util.Iterator;

import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;
import com.tacstargame.combat.unit.Unit;

public class GearSetImpl implements GearSet {
	
	private Unit unit;
	private HashMap<GearSlot, Gear> gearSet = new HashMap<GearSlot, Gear>();
	
	public GearSetImpl(Unit unit) {
		this.unit = unit;
		initGearSet();
	}
	
	private void initGearSet() {
		for (GearSlot gearSlot : GearSlot.values()) {
			gearSet.put(gearSlot, null);
		}
	}

	@Override
	public Gear equip(Gear gear) {
		Gear tmp = gearSet.get(gear.getGearSlot());
		tmp.onUnEquip(unit);
		gearSet.put(gear.getGearSlot(), gear);
		gear.onEquip(unit);
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_GEAR_CHANGED, unit, gear.getGearSlot(), gear);
		return tmp;
	}

	@Override
	public Gear unequip(GearSlot gearSlot) {
		Gear tmp = gearSet.get(gearSlot);
		gearSet.put(gearSlot, null);
		tmp.onUnEquip(unit);
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_GEAR_CHANGED, unit, gearSlot, null);
		return tmp;
	}

	@Override
	public Gear getGear(GearSlot gearSlot) {
		return gearSet.get(gearSlot);
	}

	@Override
	public Iterator<Gear> iterator() {
		return gearSet.values().iterator();
	}

}
