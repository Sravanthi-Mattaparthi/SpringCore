package com.withoutByType;

public class Models {

	private String models;
	private String type;
	
	
	//setters and getters
	public String getModels() {
		return models;
	}
	public void setModels(String models) {
		this.models = models;
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
		return "Models [models=" + models + ", type=" + type + "]";
	}
	
	
}
