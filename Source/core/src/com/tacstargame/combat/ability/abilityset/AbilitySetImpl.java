package com.tacstargame.combat.ability.abilityset;

import java.util.ArrayList;
import java.util.List;

import com.tacstargame.combat.ability.Ability;
import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;

public class AbilitySetImpl implements AbilitySet {
	
	private List<Ability> abilities = new ArrayList<Ability>();
	
	public AbilitySetImpl() {}

	@Override
	public void addAbility(Ability ability) {
		if (abilities.contains(ability)) {
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_ABILITY_ADDED, false, ability);
		} else {
			abilities.add(ability);
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_ABILITY_ADDED, true, ability);
		}
	}

	@Override
	public void removeAbility(Ability ability) {
		if (abilities.contains(ability)) {
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_ABILITY_REMOVED, false, ability);
		} else {
			abilities.add(ability);
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_ABILITY_REMOVED, true, ability);
		}
	}
	
}
