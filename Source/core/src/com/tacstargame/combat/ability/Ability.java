package com.tacstargame.combat.ability;

import com.tacstargame.combat.core.Combat;
import com.tacstargame.combat.unit.Unit;
import com.tacstargame.combat.unit.resource.Resource;

public interface Ability {
	void execute(Combat combat, Unit source, Unit target);
	AbilityDamageType getAbilityType();
	AbilityResource getAbilityResource();
	AbilityTarget getAbilityTarget();
	AbilityDamageType getAbilityDamageType();
	int getResourceCost();
	double getCritChance();
	double getMissChance();
	String getName();
}
