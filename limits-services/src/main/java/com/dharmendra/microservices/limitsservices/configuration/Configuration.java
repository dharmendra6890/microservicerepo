package com.dharmendra.microservices.limitsservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author Dharmendra Kumar 
 *
 * Pickup data from application.properties
 * Create a Configuration class,annotated with 
 * @Component
 * @ConfigurationProperties("limits-services")
 * limits-services- Application name and generate setter and getter methods
 * Bean class 
 */


@Component
@ConfigurationProperties("limits-services")
public class Configuration {
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
