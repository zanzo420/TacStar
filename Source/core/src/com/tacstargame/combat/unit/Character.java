package com.tacstargame.combat.unit;

import com.tacstargame.combat.gear.GearSet;
import com.tacstargame.combat.unit.stats.Stats;

public interface Character extends Unit {
	Stats getGearStats();
	GearSet getGearSet();
}
