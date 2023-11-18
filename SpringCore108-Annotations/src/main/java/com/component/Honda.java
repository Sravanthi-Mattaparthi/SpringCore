package com.component;

import org.springframework.stereotype.Component;

@Component
public class Honda {
	
	
	
	
	private Models models; //HAS a relationship

	
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