/**
 * 
 */
package com.handonlab.microservices.limitsservice.bean;

/**
 * @author M.Othman
 *
 */
public class LimitConfiguration {

	
	private int maximum;
	
	private int minimum;
	
	

	/**
	 * Default Constructor
	 */
	protected LimitConfiguration() {
	}

	public LimitConfiguration(int maximum, int minimum) {
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @param maximum the maximum to set
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * @param minimum the minimum to set
	 */
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
