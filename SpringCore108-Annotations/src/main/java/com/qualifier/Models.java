package com.qualifier;

public class Models {

	private String carName;
	private double cost;
	private String generation;
	private String type;
	
	
	//setters and getters
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Models [carName=" + carName + ", cost=" + cost + ", generation=" + generation + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
}
