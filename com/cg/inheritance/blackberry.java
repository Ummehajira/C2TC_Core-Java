package com.cg.inheritance;

public class blackberry extends Mobile {

	public blackberry(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return"This is superclass method"+this.model;
	}
}
