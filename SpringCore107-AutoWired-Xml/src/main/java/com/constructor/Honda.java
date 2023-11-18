package com.constructor;

public class Honda {

	private Models models;
	
	//default constructor
	public Honda() {
		
	}
	
	
	//parameterized constructor
	
	public Honda(Models models) {
		super();
		this.models = models;
	}

	//setters and getters
	public Models getModels() {
		return models;
	}

	


	public void setModels(Models models) {
		this.models = models;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Honda [models=" + models + "]";
	}
	
	
	
	
}
