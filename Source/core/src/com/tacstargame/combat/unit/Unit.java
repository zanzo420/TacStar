package com.tacstargame.combat.unit;

import com.tacstargame.combat.ability.abilityset.AbilitySet;
import com.tacstargame.combat.statuseffect.StatusEffectSet;
import com.tacstargame.combat.unit.resource.Resource;
import com.tacstargame.combat.unit.stats.Stats;

public interface Unit {
	Resource getHealth();
	Resource getPrimaryResource();
	Resource getSecondaryResource();
	StatusEffectSet getStatusEffectSet();
	AbilitySet getAbilitySet();
	Stats getBaseStats();
	Stats getStatusEffectStats();
	Stats getStats();
}
