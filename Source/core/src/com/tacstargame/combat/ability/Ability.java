package com.tacstargame.combat.ability;

import com.tacstargame.combat.core.Combat;
import com.tacstargame.combat.unit.Unit;

public interface Ability {
	void execute(Combat combat, Unit source, Unit target);
}
