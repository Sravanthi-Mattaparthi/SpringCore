package com.fieldLevel;

import org.springframework.beans.factory.annotation.Autowired;

public class Honda {

	
	@Autowired   //at field level
	private Models models;

	//default constructor
	public Honda() {
		
	}
	
	//parameterized

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
