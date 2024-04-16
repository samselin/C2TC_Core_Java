package com.TNSIF.C2TC.daythree;

public class Student extends Citizen {
	private int rollNo;
	private String collegename;
	
	
	
	public Student()
	{
		
		super();
		
	}
	public Student(String name, String aadharno, String address, long phno, int rollNo, String collegename) {
		super(name, aadharno, address, phno);
		this.rollNo = rollNo;
		this.collegename = collegename;
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getCollegename() {
		return collegename;
	}



	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}



	
	

}
