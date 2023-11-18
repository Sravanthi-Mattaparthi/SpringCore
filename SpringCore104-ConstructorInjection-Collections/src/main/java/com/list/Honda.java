package com.list;

import java.util.List;

public class Honda {


private String sname;
private List<String> models;


//default constructor
public Honda() {
	
}


//parameterized constructor
public Honda(String sname, List<String> models) {
	
	this.sname = sname;
	this.models = models;
}


//toSting
@Override
public String toString() {
	return "Honda [sname=" + sname + ", models=" + models + "]";
}

	

}
