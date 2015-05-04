package com.tacstargame.combat.unit.character;

import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;
import com.tacstargame.combat.eventbus.EventBusListener;
import com.tacstargame.combat.gear.GearSlot;
import com.tacstargame.combat.gear.impl.FeetOfTheWalker;
import com.tacstargame.combat.gear.impl.RingOfTheProtector;
import com.tacstargame.combat.statuseffect.impl.GiftOfTheBear;
import com.tacstargame.combat.unit.resource.Energy;
import com.tacstargame.combat.unit.stats.BaseStat;
import com.tacstargame.combat.unit.stats.ModificatorStat;


public class Lenor extends CharacterImpl {

	public Lenor() {
		super("Lenor");	
		setSecondaryResource(new Energy(this, 2000));
		getBaseStats().increaseStat(BaseStat.STAMINA, 5);
		getBaseStats().increaseStat(ModificatorStat.MAXENERGY, 15);
		getBaseStats().increaseStat(BaseStat.SPEED, 15);
	}
	
	public static void main(String ... args) {
		Character character = new Lenor();

		EventBusListener listener = new EventBusListener() {
			
			@Override
			public void OnEventFired(EventBusEvent busEvent, Object... args) {
				System.out.println("Event: " + busEvent + " Arg1: " + args[0] + " Arg2: " + args[1]);
			}
		};
		EventBusImpl.getInstance().registerForMultipleEvents(listener, EventBusEvent.values());
		System.out.println("HP: " + character.getHealth().getMaxValue());
		System.out.println("MANA: " + character.getSecondaryResource().getCurrentValue() + "/" +  character.getSecondaryResource().getMaxValue());
		System.out.println("---------------------------------------------");
		character.getStatusEffectSet().addStatusEffect(character, new GiftOfTheBear());
		character.getGearSet().equip(new RingOfTheProtector());
		character.getSecondaryResource().turnOver();
		System.out.println("HP: " + character.getHealth().getMaxValue());
		System.out.println("MANA: " + character.getSecondaryResource().getCurrentValue() + "/" +  character.getSecondaryResource().getMaxValue());
		System.out.println("---------------------------------------------");
		character.getGearSet().equip(new FeetOfTheWalker());
		System.out.println("HP: " + character.getHealth().getMaxValue());
		System.out.println("MANA: " + character.getSecondaryResource().getCurrentValue() + "/" +  character.getSecondaryResource().getMaxValue());
		System.out.println("---------------------------------------------");
		character.getGearSet().unequip(GearSlot.RING);
		System.out.println("HP: " + character.getHealth().getMaxValue());
		System.out.println("MANA: " + character.getSecondaryResource().getCurrentValue() + "/" +  character.getSecondaryResource().getMaxValue());
		System.out.println("---------------------------------------------");
		character.getStatusEffectSet().dispellStatusEffect(new GiftOfTheBear());
		character.getGearSet().unequip(GearSlot.FEET);
		System.out.println("HP: " + character.getHealth().getMaxValue());
		System.out.println("MANA: " + character.getSecondaryResource().getCurrentValue() + "/" +  character.getSecondaryResource().getMaxValue());

	}

}
