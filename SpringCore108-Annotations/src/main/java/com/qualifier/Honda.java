package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Honda {
	
	@Autowired
	@Qualifier("id2")
	
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
