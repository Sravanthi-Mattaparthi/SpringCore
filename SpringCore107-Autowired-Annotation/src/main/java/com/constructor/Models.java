package com.constructor;

public class Models {
	
	private String models;
	private String type;
	
	
	//default constructor
	public Models() {
		
	}
	
	
	//parameterized constructor
	
	public Models(String models, String type) {
		super();
		this.models = models;
		this.type = type;
	}




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
