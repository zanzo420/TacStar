package com.tacstargame.combat.eventbus;

public interface EventBus {
	void registerForEvent(EventBusListener eventBusListener, EventBusEvent busEvent);
	void deregisterForEvent(EventBusListener eventBusListener, EventBusEvent busEvent);
	void deregisterForAllEvents(EventBusListener eventBusListener);
	void fireEvent(EventBusEvent busEvent, Object ... args);
}
