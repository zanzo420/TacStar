package com.tacstargame.combat.statuseffect;

import java.util.List;

import com.tacstargame.combat.unit.Unit;

public interface StatusEffectSet extends Iterable<StatusEffect> {
	
	/**
	 * Adds a StatusEffect to this Set.
	 * 
	 * @param source Source of the StatusEffect.
	 * @param statusEffect The StatusEffect that will be added.
	 */
	void addStatusEffect(Unit source, StatusEffect statusEffect);
	
	/**
	 * Removes the StatusEffect from the Set.
	 * 
	 * @param statusEffect The StatusEffect that will be removed.
	 * @return The StatusEffect that was removed.
	 */
	StatusEffect removeStatusEffect(StatusEffect statusEffect);
	
	/**
	 * Dispells a StatusEffect.
	 * 
	 * @param statusEffect StatusEffect that will be dispelled.
	 * @return The dispelled StatusEffect.
	 */
	StatusEffect dispellStatusEffect(StatusEffect statusEffect);
	
	/**
	 * Is invoked if a Turn of the Combat is over.
	 * 
	 */
	void turnOver();
	
	/**
	 * Returns all Buffs of this Set.
	 * 
	 * @return Buffs of this Set.
	 */
	List<StatusEffect> getAllBuffs();
	
	/**
	 * Returns all Debuffs of this Set.
	 * 
	 * @return Debuffs of this Set.
	 */
	List<StatusEffect> getAllDebuffs();
}
