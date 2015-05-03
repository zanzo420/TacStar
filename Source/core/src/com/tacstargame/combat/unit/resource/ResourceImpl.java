package com.tacstargame.combat.unit.resource;

import com.tacstargame.combat.eventbus.EventBusEvent;
import com.tacstargame.combat.eventbus.EventBusImpl;
import com.tacstargame.combat.unit.Unit;

public abstract class ResourceImpl implements Resource {
	
	private int maxResourceValue;
	private int currentResourceValue;
	private Unit unit;
	
	public ResourceImpl(Unit unit, int currentResourceValue, int maxResourceValue) {
		this.maxResourceValue = maxResourceValue;
		this.currentResourceValue = currentResourceValue;
		this.unit = unit;
	}

	@Override
	public void setMaxValue(int value) {
		int difference = value - currentResourceValue;
		maxResourceValue = value;
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_RESOURCE_MAXVALUE_CHANGED, unit, this, difference);
	}
	
	@Override
	public void setCurrentValue(int value) {
		int difference = value - currentResourceValue;
		currentResourceValue = value;
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_RESOURCE_CURRENTVALUE_CHANGED, unit, this, difference);
	}

	@Override
	public void increaseCurrentValue(int value) {
		currentResourceValue += value;
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_RESOURCE_CURRENTVALUE_CHANGED, unit, this, value);
	}

	@Override
	public void increaseMaxValue(int value) {
		maxResourceValue += value;
		EventBusImpl.getInstance().fireEvent(EventBusEvent.UNIT_RESOURCE_MAXVALUE_CHANGED, unit, this, value);
	}

	@Override
	public int getMaxValue() {
		return maxResourceValue;
	}

	@Override
	public int getCurrentValue() {
		return currentResourceValue;
	}

	@Override
	public void turnOver() {
	}

}
