package com.two;

public class Location {
	
	private String city;
	private String state;
	private  Student student;
	
	//default constructor
	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	
	//parameterized constructor
	public Location(String city, String state, Student student) {
		
		this.city = city;
		this.state = state;
		this.student = student;
	}


     //toString
	@Override
	public String toString() {
		return "Location [city=" + city + ", state=" + state + ", student=" + student + "]";
	}
	
	
	
	
	

}
