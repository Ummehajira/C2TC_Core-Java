package com.cg.inheritance;

public class Android extends Mobile {
	public Android(String manufacturer, String operating_system, String model, double cost) {
		super(manufacturer, operating_system, model, cost);
	}
	public String getModel() {
		return"This is androidclass method"+this.model;
	}

}
