package com.dl.setterInjection;

public class HondaCars {
	
	
	//setters and getters
	
	private String carModels;

	public String getCarModels() {
		return carModels;
	}

	public void setCarModels(String carModels) {
		this.carModels = carModels;
	}

	
	//toString
	@Override
	public String toString() {
		return "HondaCars [carModels=" + carModels + "]";
	}
	
	
	
	
	

}
