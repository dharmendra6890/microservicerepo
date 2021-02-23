package com.dharmendra.microservices.limitsservices.bean;


/**
 * @author Dharmendra Kumar 
 *
 * Created a hard coded limits service
 * Bean class 
 */

public class Limits {
	private int minmum;
	private int maximum;
	
	public Limits() {
		super();
	}
	
	public Limits(int minmum, int maximum) {
		super();
		this.minmum = minmum;
		this.maximum = maximum;
	}
	
	public int getMinmum() {
		return minmum;
	}
	public void setMinmum(int minmum) {
		this.minmum = minmum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
	
}
