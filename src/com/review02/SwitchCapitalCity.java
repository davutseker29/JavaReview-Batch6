package com.review02;

public class SwitchCapitalCity {

	public static void main(String[] args) {
		
		
		String country="US";
		String capitalCity;
		
		switch (country) {
			
		case "US":
			capitalCity="DC";
			break;
		case "Russia":
			capitalCity="Moskow";
			break;
		case "Turkey":
			capitalCity="Ankara";
			break;
		case "china":
			capitalCity="Beijing";
			break;
		case "Pakistan":
			capitalCity="Islamabad";
		default:
			capitalCity="Not in my list"	;
			
			
			System.out.println("the capital city of "+ country+" is "+capitalCity);
			
			
			

	}

}}
