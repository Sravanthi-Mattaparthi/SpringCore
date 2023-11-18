package com.one;

public class Models {
	
	private String carName;
	private double cost;
	private String type;
	private String generation;
	
	
	public Models() {
		
	}

	//parameterized constructor
	
	public Models(String carName, double cost, String type, String generation) {
		super();
		this.carName = carName;
		this.cost = cost;
		this.type = type;
		this.generation = generation;
	}




	//toString
	@Override
	public String toString() {
		return "Models [carName=" + carName + ", cost=" + cost + ", type=" + type + ", generation=" + generation + "]";
	}
	
	
	
	

}
