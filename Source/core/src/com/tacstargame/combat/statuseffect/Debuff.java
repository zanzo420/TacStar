package com.tacstargame.combat.statuseffect;

import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;
import com.tacstargame.combat.unit.Unit;

public class Debuff extends StatusEffectImpl {

	public Debuff(String name, String description, int fullDuration,
			boolean dispellable) {
		super(name, description, fullDuration, dispellable);
	}
	
	@Override
	public void onApply(Unit source, Unit target) {
		super.onApply(source, target);
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_DEBUFF_APPLIED, source, target);
	}

	@Override
	public void onFade(Unit target) {
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_DEBUFF_FADED, source, target);
	}

	@Override
	public void onRemove(Unit target) {
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_DEBUFF_REMOVED, source, target);
	}

	@Override
	public void onDispell(Unit target) {
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_DEBUFF_DISPELLED, source, target);
	}

}
