package com.tacstargame.combat.unit;

import com.tacstargame.combat.ability.abilityset.AbilitySet;
import com.tacstargame.combat.statuseffect.StatusEffectSet;
import com.tacstargame.combat.unit.resource.Resource;
import com.tacstargame.combat.unit.stats.Stats;

public abstract class UnitImpl implements Unit {
	
	private Resource health;
	private Resource primaryResource;
	private Resource secondaryResource; 
	
	private StatusEffectSet statusEffectSet;
	
	private AbilitySet abilitySet;
	
	private Stats baseStats;
	private Stats statusEffectStats;
	
	@Override
	public Resource getHealth() {
		return health;
	}
	
	@Override
	public Resource getPrimaryResource() {
		return primaryResource;
	}
	
	@Override
	public Resource getSecondaryResource() {
		return secondaryResource;
	}
	
	@Override
	public StatusEffectSet getStatusEffectSet() {
		return statusEffectSet;
	}
	
	@Override
	public AbilitySet getAbilitySet() {
		return abilitySet;
	}
	
	@Override
	public Stats getBaseStats() {
		return baseStats;
	}
	
	@Override
	public Stats getStatusEffectStats() {
		return statusEffectStats;
	}
	
	@Override
	public Stats getStats() {
		return baseStats.add(statusEffectStats);
	}



}
