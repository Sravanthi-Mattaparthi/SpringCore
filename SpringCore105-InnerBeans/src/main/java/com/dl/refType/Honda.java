package com.dl.refType;

public class Honda {
	
	HondaCars hondacars;

	//default constructor
	public Honda() {
	
	}
	
	
	//parameterized constructor

	public Honda(HondaCars hondacars) {
		super();
		this.hondacars = hondacars;
	}
	

	//toString
	
	@Override
	public String toString() {
		return "Honda [hondacars=" + hondacars + "]";
	}


	//getters and setter
	public HondaCars getHondacars() {
		return hondacars;
	}


	public void setHondacars(HondaCars hondacars) {
		this.hondacars = hondacars;
	}

	
	

	

}
