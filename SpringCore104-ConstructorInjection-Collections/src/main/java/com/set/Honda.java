package com.set;

import java.util.Set;

public class Honda {


private String sname;
private Set<String> models;


//default Constructor
public Honda() {
	
}

// parameterized constructor
public Honda(String sname, Set<String> models) {
	
	this.sname = sname;
	this.models = models;
}


//toString
@Override
public String toString() {
	return "Honda [sname=" + sname + ", models=" + models + "]";
}

	

}
