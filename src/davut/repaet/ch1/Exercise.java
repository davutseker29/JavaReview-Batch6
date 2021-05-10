package davut.repaet.ch1;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {

//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.

//		Scanner scan=new Scanner(System.in);
//		System.out.println("how many do you want?");
//		double quant=scan.nextDouble();
//		double price;
//		if(quant>1000) {
//			
//			price=100*0.1*quant;
//			
//		}else {
//			price=100*quant;
//		}
//		System.out.println("total cost is "+price);
//		Scanner scan = new Scanner(System.in);
//		System.out.println("type a number from 1 to 7");
//		int num = scan.nextInt();
//		String dayName;
//		if (num == 1) {
//			dayName = "monday";
//		} else if (num == 2) {
//			dayName = "tuesday";
//		} else if (num == 3) {
//			dayName = "wednesday";
//		} else if (num == 4) {
//			dayName = "thursday";
//		} else if (num == 5) {
//			dayName = "friday";
//		} else if (num == 6) {
//			dayName = "saturday";
//		} else if (num == 7) {
//			dayName = "sunday";
//		} else {
//			dayName = "invalid";
//
//		}
//		System.out.println("today is " + dayName);
//
//		System.out.println("===========Switch Statemnet============");
//		System.out.println("type another number inbetween 1-7");
//		int day = scan.nextInt();
//		
//		String today;
//		switch (day)
//
//		{
//		case 1:
//			today = "monday";
//			break;
//		case 2:
//			today="tuesday";
//			break;
//		case 3:
//			today="wednesday";
//		case 4:
//			today="thursday";
//		case 5:
//			today="friday";
//		case 6:
//			today="saturday";
//		case 7:
//			today="sunday";
//			default:
//				today="invalid";
//
//		}
//		System.out.println("Today is "+today);

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("write your gender");
//		char gender=scan.next().charAt(0);
//		String kidGender;
//		
//		switch(gender) {
//		case 'm':
//			kidGender="male";
//			break;
//		case 'f':
//			kidGender="female";
//			break;
//			default:
//				kidGender="invalid";
//		}
//		System.out.println("kid`s gender is "+kidGender);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("please write where you from coming");
//		String contName = scan.nextLine();
//		String nat;
//
//		switch (contName) {
//		case "Turkey":
//			nat = "Turkish";
//			break;
//		case "Iraq":
//			nat = "Arap";
//			break;
//		case "USA":
//			nat = "American";
//			break;
//		case "Canada":
//			nat = "Canadian";
//			break;
//		case "Russia":
//			nat = "Russian";
//			break;
//		case "Korea":
//			nat = "Korean";
//			break;
//		default:
//			nat = "invalid";
//
//		}
//		System.out.println("if you are from " + contName + " than you are " + nat);

//		Scanner scan = new Scanner(System.in);
//		System.out.println("please enter a sign");
//		char sign = scan.next().charAt(0);
//		System.out.println("please enter a number");
//		double num = scan.nextDouble();
//		System.out.println("please enter another number");
//		double num2 = scan.nextDouble();
//		double rslt = 0;
//		
//		switch (sign) {
//		case '+':
//			rslt=num+num2;
//			break;
//		case'-':
//			rslt=num-num2;
//			break;
//		case'*':
//			rslt=num*num2;
//			break;
//		case'/':
//			rslt=num/num2;
//			break;
//			default:
//				System.out.println("invalid enterance");
//				return;
//		}
//		System.out.println("rslt is equal to "+rslt);

		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		int num = scan.nextInt();
		String month;

		switch (num) {
		case 1:
			month = "jan";
			break;
		case 2:
			month = "feb";
			break;
		case 3:
			month = "march";
			break;
		case 4:
			month = "april";
			break;
		case 5:
			month="may";
			break;
		case 6:
			month="june";
			break;
		case 7:
			month="july";
			break;
		case 8:
			month="aug";
			break;
		case 9:
			month="sep";
			break;
		case 10:
			month="oct";
			break;
		case 11:
			month="nov";
		case 12:
			month="dec";
			default:
			System.out.println("dont know it");
			return;

		}
		System.out.println(month);

	}

}
