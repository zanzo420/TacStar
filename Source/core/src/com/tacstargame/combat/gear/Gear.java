package com.tacstargame.combat.gear;

import com.tacstargame.combat.unit.Unit;
import com.tacstargame.combat.unit.stats.Stats;

public interface Gear {
	
	/**
	 * Is invoked if Gear is added to a GearSet.
	 * 
	 * @param unit The Unit that holds the GearSet.
	 */
	void onEquip(Unit unit);
	
	/**
	 * Is invoked if Gear is removed from a GearSet.
	 * 
	 * @param unit
	 */
	void onUnEquip(Unit unit);
	
	/**
	 * Returns the Stats that his
	 * 
	 * @return The Stats of the Gear.
	 */
	Stats getStats();
	
	/**
	 * Returns the OnEquip description of that Gear. 
	 * 
	 * @return null if Gear has no OnEquip effect.
	 */
	String getOnEquipDescription();
	
	/**
	 * Returns the GearSlot of that Gear.
	 * 
	 * @return The GearSlot.
	 */
	GearSlot getGearSlot();
}
