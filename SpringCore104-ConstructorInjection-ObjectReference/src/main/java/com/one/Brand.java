package com.one;

public class Brand {

	private Models models;

//default constructor
public Brand() {
	
}


//parameterized constructor

public Brand(Models models) {
	super();
	this.models = models;
}
	


//toString
	
	@Override
	public String toString() {
		return "Brand [models=" + models + "]";
	}


	
	
}
