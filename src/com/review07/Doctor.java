package com.review07;

public class Doctor {
	
	String name;
	String licenceID;
	int salary;
	
	public void checkUp() {
		System.out.println("Doctor "+ name+ " has ordered blood test.");
	}
	
	public void treatPatient(String patientName) {
		System.out.println("Doctor "+name+" gives prescription to "+patientName);
	}
	
	public void chargePatient() {
		System.out.println("Let me charge $100.");
	}
	
	public void displayInfo() {
		System.out.println("Doctor "+name+" with licenceID "+licenceID+" has a salary "+salary );
	}
}
