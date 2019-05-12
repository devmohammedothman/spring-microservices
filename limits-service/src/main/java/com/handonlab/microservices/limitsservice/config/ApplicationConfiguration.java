/**
 * 
 */
package com.handonlab.microservices.limitsservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author M.Othman
 *
 */
@Configuration
@ConfigurationProperties("limits-service")
public class ApplicationConfiguration {
	
	private int minimum;
	
	
	private int maximum;


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
	
	

}
