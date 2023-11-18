package com.one;

public class Student {
	
	private int rollno;
	private double stipend;
	private String university;
	
	//parameterized constructor
	
	public Student(int rollno, double stipend, String university) {
		super();
		this.rollno = rollno;
		this.stipend = stipend;
		this.university = university;
	}

	
	//toString
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", stipend=" + stipend + ", university=" + university + "]";
	}

}
