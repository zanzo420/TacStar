package com.tacstargame.combat.core;

import com.tacstargame.combat.ability.Ability;
import com.tacstargame.combat.unit.Unit;
import com.tacstargame.combat.unit.resource.Resource;

public interface Combat {
	void calculateStep();
	void roundReady();
	void roundOver();
	void addAbilityForRound(Unit unit, Ability ability);
	void changeHealth(Resource resource, Unit target);
}
