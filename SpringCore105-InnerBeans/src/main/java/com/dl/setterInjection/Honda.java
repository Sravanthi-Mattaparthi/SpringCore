package com.dl.setterInjection;

public class Honda {
	
	HondaCars hondacars;

	public HondaCars getHondacars() {
		return hondacars;
	}

	public void setHondacars(HondaCars hondacars) {
		this.hondacars = hondacars;
	}

	//toString
	
	@Override
	public String toString() {
		return "Honda [hondacars=" + hondacars + "]";
	}
	

}
