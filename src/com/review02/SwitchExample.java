package com.review02;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number for the month");
		int month=scan.nextInt();
		
		String monthName;
		
		switch (month) {
		case 1:
			monthName="January";
			break;
		case 2:
			monthName="February";
			break;
		case 3:
			monthName="March";
			break;
		case 4:
			monthName="April";
			break;
		case 5:
			monthName="May";
			break;
		case 6:
			monthName="June";
			break;
		case 7:
			monthName="July";
			break;
		case 8:
			monthName="August";
			break;
		case 9:
			monthName="September";
			break;
		case 10:
			monthName="October";
			break;
		case 11:
			monthName="November";
			break;
		case 12:
			monthName="December";
			break;
			default:
			monthName="Invalid";}
		
		System.out.println("The month you entered is  "+monthName);
		}
	
	
	}

