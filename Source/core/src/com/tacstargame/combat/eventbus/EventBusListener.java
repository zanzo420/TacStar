package com.tacstargame.combat.eventbus;

public interface EventBusListener {
	void OnEventFired(EventBusEvent busEvent, Object ... args);
}
