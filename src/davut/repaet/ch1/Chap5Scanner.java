package davut.repaet.ch1;

import java.util.Scanner;

public class Chap5Scanner {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("how much loan do you need?");
//		int loan = scan.nextInt();
//		System.out.println(loan);
//
//		if (loan < 200000) {
//			System.out.println("i can help you out");
//		} else {
//			System.out.println("i cant help you it is too much");
//		}

//		Scanner scan = new Scanner(System.in);

//		System.out.println("how old are you?");
//		int age = scan.nextInt();
//
//		if (age >= 18) {
//			System.out.println("i can issue your license");
//
//		} else {
//			System.out.println("you need to get a permit");
//		}

//		System.out.println("please enter the city you join");
//		String city=scan.nextLine();
//		
//		System.out.println("enter the weather as a fah");
//		int temp=scan.nextInt();
//		double cel=((temp*32-32)/9)*5;
//		
//		System.out.println("The temperature is the city "+city+" is "+cel);

//		System.out.println("please enter a number");
//		int even=scan.nextInt();
//		
//		if(even%2==0) {
//			System.out.println("number is even");
//		}else {
//			System.out.println("number is odd");
//		}

		// capture 2 numbers from a user
		// compare numbers which is larger

//		System.out.println("write a number");
//		int num1 = scan.nextInt();
//		System.out.println("write another number");
//		int num2 = scan.nextInt();
//
//		if (num1 > num2) {
//			System.out.println(num1 + " is larger than " + num2);
//
//		} else if (num1 == num2) {
//			System.out.println(num1 + " and " + num2 + " are same numbers");
//		}else {
//			System.out.println(num2 + " is larger than "+num1);
//		}

//		System.out.println("write your age");
//		int age=scan.nextInt();
//		
//		if(age<3 && age>0) {
//			System.out.println("you are a baby");
//		}else if(age>4 && age<5) {
//			System.out.println("you are a kid");
//			
//		}else if(age>6 && age<12) {
//			System.out.println("you are a child");
//		}else if(age>13 && age<19) {
//			System.out.println("you are a teeanger");
//		}else if(age>20 && age<64) {
//			System.out.println("you are an adult");
//		}else {
//			System.out.println("you are a senior");
//		}

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("do you have credit card?");
//		String answer=scan.nextLine();
//		
//		if (answer.equals("No")) {
//			System.out.println("Do you want to apply one?");
//			String resp=scan.nextLine();
//			if(resp.equals("No")) {
//				System.out.println("bye");
//			}else {
//				System.out.println("how much balance do you want?");
//				int bal=scan.nextInt();
//			}
//		}else {
//			System.out.println("how much is the balance?");
//			int num=scan.nextInt();
//			
//			if(num>1000) {
//				System.out.println("you should pay ASAP");
//			}else {
//				System.out.println("not a big problem");
//			}
//		}
//	
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("enter your quiz");
//		int quiz=scan.nextInt();
//		quiz*=0.2;
//		System.out.println(quiz);
//		
//		System.out.println("enter your mid term");
//		int midTe=scan.nextInt();
//		midTe*=0.3;
//		System.out.println(midTe);
//		
//		System.out.println("enter your final");
//		int finalE=scan.nextInt();
//		finalE*=0.5;
//		System.out.println(finalE);
//		
//		double avg=quiz+midTe+finalE;
//		System.out.println(avg);
//		
//		if (avg>90) {
//			System.out.println("gpa is A");
//		}else if(avg<90 && avg>80) {
//			System.out.println("gpa is B");
//		}else if(avg>70 && avg<80) {
//			System.out.println("gpa is C");
//		}else if(avg<70 && avg>60) {
//			System.out.println("gpa is D");
//		}else {
//			System.out.println("it is F");
//		}

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("please enter your birth month");
//		String bM=scan.nextLine();
//		String season;
//		
//		if(bM.equals("Jan") || bM.equals("Feb") || bM.equals("Dec") ) {
//			season="winter";
//		}else if(bM.equals("March") || bM.equals("April") || bM.equals("May") ) {
//			season="spring";
//		}else if(bM.equals("June") || bM.equals("July") || bM.equals("Aug") ) {
//			season="summer";
//		}else {
//			season="fall";
//		}
//		System.out.println(season);

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("how is the weather?");
//		
//		String weather=scan.nextLine();
//		if(weather=="cold") {
//			System.out.println("it is bye");
//			
//		}else if(weather.equals("chil")) {
//			System.out.println("i might");
//		}else if (weather.equals("hot")){
//			System.out.println("hello");
//		}else {
//			System.out.println("undefine");
//		}

		/*
		 * if you run with and you have only one condition which is day=6, to be able to
		 * run day=6 and day=7 both conditions have to be right so if you run with AND
		 * you will get "Invalid Day"
		 */

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("please enter the day");
//		String day=scan.nextLine();
//		
//		if(day.equals("Monday") || day.equals("Wednesday")) {
//			System.out.println("it is SDLC");
//		}else if(day.equals("Tuesday") || day.equals("Thursday")) {
//			System.out.println("it is git");
//		}else if(day.equals("Saturday") || day.equals("Sunday")) {
//			System.out.println("it is Java");
//		}else {
//			System.out.println("it is invalid");
//		}

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("enter");
//		char var=scan.next().charAt(0);
//		System.out.println(var);
//		
//		System.out.println("enter another");
//		char news=scan.next().charAt(0);
//		System.out.println(news);

		/*
		 * take an age input from a user and then based on the age print output Age 0-3
		 * -->You are a baby Age 4-5 -->You are a kid Age 6-12-->You are a child Age
		 * 13-19-->You are a teenager Age 20-64-->You are an adult Age is more or equal
		 * to 65 -->You are a senior
		 */

//		Scanner scan=new Scanner(System.in);
//		System.out.println("how old are you?");
//		
//		int age=scan.nextInt();
//		
//		if(age<=3 && age>=0) {
//			System.out.println("you are a baby");
//		}else if(age==4 || age==5) {
//			System.out.println("you are a kid");
//		}else if(age<=12 && age>=6) {
//			System.out.println("you are a child");
//		}else if(age<=19 && age>=13) {
//			System.out.println("you are a teenager");
//		}else if(age<=64 && age>=20) {
//			System.out.println("you are an adult");
//		}else if (age>=65) {
//			System.out.println("you are a senior");
//		}else {
//			System.out.println("invalid");
//		}

		/*
		 * You are a salesman ask a user for how much his sales are based on the amount
		 * of sales we need to calculate his commission if sales in between 1-100-->
		 * commission should be 10% if sales in between 100-200--> commission should be
		 * 20% if sales in between 200-500--> commission should be 30% if sales more
		 * than 500--> commission should be 50%
		 */

//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("how much is your sale?");
//		int sale=scan.nextInt();
//		double com;
//		
//		if(sale<100 && sale>=1) {
//		com=sale*0.1;
//		System.out.println("your commission is "+com);
//		}else if(sale<200 && sale>=100) {
//			com=sale*0.2;
//			System.out.println("your commission is "+com);
//		}else if(sale<500 && sale>=200) {
//			com=sale*0.3;
//			System.out.println("your commission is "+com);	
//		}else if(sale>=500) {
//			com=sale*0.5;
//			System.out.println("your commissin is "+com);
//		}else {
//			System.out.println("invalid");
//		}

		/*
		 * Write a program to ask user if there is a sale if there is no sale, no going
		 * to shopping if there is a sale, we will ask the price of the item based on
		 * the price we will apply discount and calculate final price
		 *
		 * if price less than 20---> apply 10% if price between 20-100---> apply 20% if
		 * price between 100-500---> apply 30% if price more than 500---> apply 50%
		 *
		 * After discount __ the price of the item reduced from __ to __
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("is there a sale?");
		boolean sale = scan.nextBoolean();
		double prc;
		if (sale == true) {
			System.out.println("how much is the price?");
			int price = scan.nextInt();
			if(price<20) {
			prc=price*0.9;
			System.out.println("final price is "+prc);
			}else if(price>=20 && price<100) {
				prc=price*0.8;
				System.out.println("final price is "+prc);
			}
			else if(price>=100 && price<500) {
				prc=price*0.7;
				System.out.println("final price is "+prc);
			}
			else if(price>=500) {
				prc=price*0.5;
				System.out.println("final price is "+prc);
			}
		} else {
			System.out.println("no going to shopping");
		}
		
	}

}
