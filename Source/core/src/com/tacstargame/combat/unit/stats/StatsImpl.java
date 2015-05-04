package com.tacstargame.combat.unit.stats;

import java.util.HashMap;

import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;
import com.tacstargame.combat.eventbus.EventBusListener;
import com.tacstargame.combat.unit.Unit;

public class StatsImpl implements Stats {
	
	private HashMap<Stat, Integer> stats = new HashMap<Stat, Integer>();
	private Unit unit;
	
	/**
	 * Creates an StatList with zero values.
	 * 
	 */
	public StatsImpl(Unit unit) {
		this.unit = unit;
		initialiseStat(BaseStat.values());
		initialiseStat(ChanceStat.values());
		initialiseStat(ModificatorStat.values());
		initialiseStat(ResistanceStat.values());
	}
	
	private void initialiseStat(Stat ... stats) {
		for (Stat stat : stats) {
			this.stats.put(stat, 0);
		}
	}

	@Override
	public int getStatValue(Stat stat) {
		return stats.get(stat);
	}

	@Override
	public void increaseStat(Stat stat, int value) {
		if (value != 0) {
			stats.put(stat, stats.get(stat) + value);
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_STATS_CHANGED, unit, stat, value);
		}	
	}

	@Override
	public void setStat(Stat stat, int value) {
		if (value != stats.get(stat)) {
			int difference = value - stats.get(stat);
			stats.put(stat, value);
			EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_STATS_CHANGED, unit, stat, difference);
		}	
	}

	@Override
	public Stats add(Stats stats) {
		StatsImpl tmp = new StatsImpl(unit);
		for (Stat stat : this.stats.keySet()) {
			tmp.stats.put(stat, this.stats.get(stat) + stats.getStatValue(stat));
		}
		return tmp;
	}

	@Override
	public Stats increaseStats(Stats stats) {
		for (Stat stat : this.stats.keySet()) {
			increaseStat(stat, stats.getStatValue(stat));
		}
		return this;
	}
	
	public static void main(String ... args) {
		Stats stats1 = new StatsImpl(null);
		Stats stats2 = new StatsImpl(null);
		EventBusListener listener = new EventBusListener() {
			
			@Override
			public void OnEventFired(EventBusEvent busEvent, Object... args) {
				System.out.println("Event: " + busEvent + " Arg1:" + args[0] + " Arg2: " + args[1] + " Arg3: " + args[2]);
			}
		};
		EventBusImpl.getInstance().registerForMultipleEvents(listener, EventBusEvent.values());
		stats1.setStat(BaseStat.AGILITY, 3);
		stats1.setStat(BaseStat.AGILITY, 5);
		stats2.setStat(BaseStat.AGILITY, 4);
		
		System.out.println(stats1.increaseStats(stats2).getStatValue(BaseStat.AGILITY));
	}
	
}
