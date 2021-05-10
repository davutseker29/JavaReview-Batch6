package com.review07;

public class Hospital {
	
	public static void main(String[] args) {
		
	
	
	Doctor doc1=new Doctor();
	doc1.name="John Smith";
	doc1.licenceID="12345";
	doc1.salary=150000;
	doc1.displayInfo();
	doc1.chargePatient();
	doc1.treatPatient("Adam Smith");

}
}