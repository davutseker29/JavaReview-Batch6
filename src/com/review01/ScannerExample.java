package com.review01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your age?");
		int age = scan.nextInt();

		if (age < 10)
			System.out.println("You are too young");
		
		else if (age <= 20)
			System.out.println("you are growing body");
		else if (age <= 50)
			System.out.println("You are getting old");
		else
			System.out.println("be careful");
		
		
		

	}

}
