package com.tacstargame.combat.unit.resource;

public interface Resource {
	
	/**
	 * Sets the maximal Resource value to value.
	 * 
	 * @param value The new Resource cap.
	 */
	void setMaxValue(int value);
	
	/**
	 * Sets the current Resource value to value.
	 * 
	 * @param value The new current Resource value.
	 */
	void setCurrentValue(int value);
	
	/**
	 * Increases the current Resource value by value but not over the Resource cap.
	 * 
	 * @param value The value by which the current Resource value will be increased.
	 */
	void increaseCurrentValue(int value);
	
	/**
	 * Increases the Resource cap.
	 * 
	 * @param value The value by which the Resource cap will be increased.
	 */
	void increaseMaxValue(int value);
	
	/**
	 * Returns the Resource cap.
	 * 
	 * @return The Resource cap.
	 */
	int getMaxValue();
	
	/**
	 * Return the current Resource value.
	 * 
	 * @return The current Resource value.
	 */
	int getCurrentValue();
	
	/**
	 * Is invoked if one turn is over.
	 * 
	 */
	void turnOver();
}
