package com.tacstargame.combat.unit;

import com.tacstargame.combat.ability.abilityset.AbilitySet;
import com.tacstargame.combat.unit.resource.Resource;
import com.tacstargame.combat.unit.stats.Stats;

public interface Unit {
	Resource getHealth();
	Resource getMainResource();
	Resource getSecondaryResource();
	AbilitySet getAbilitySet();
	Stats getBaseStats();
	Stats getStats();
}
