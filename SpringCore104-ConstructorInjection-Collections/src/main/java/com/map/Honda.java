package com.map;

import java.util.Map;

public class Honda {


private String sname;
private Map<Integer,String> models;

//default constructor
public Honda() {
	
}


//parameterized constructor
public Honda(String sname, Map<Integer, String> models) {
	super();
	this.sname = sname;
	this.models = models;
}


//toString
@Override
public String toString() {
	return "Honda [sname=" + sname + ", models=" + models + "]";
}



}
