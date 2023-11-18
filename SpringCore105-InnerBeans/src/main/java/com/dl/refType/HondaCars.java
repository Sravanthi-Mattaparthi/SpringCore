package com.dl.refType;

public class HondaCars {

	private String carModels;
	
	//default constructor
	public HondaCars() {
		
	}
	
	
	//Parameterized constructor

	public HondaCars(String carModels) {
		super();
		this.carModels = carModels;
	}

	
	

	//toString
	@Override
	public String toString() {
		return "HondaCars [carModels=" + carModels + "]";
	}

	//getters and setters

	public String getCarModels() {
		return carModels;
	}


	public void setCarModels(String carModels) {
		this.carModels = carModels;
	}
	
	
	
	
	
	
	

}
