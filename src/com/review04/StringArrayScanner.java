package com.review04;

import java.util.Scanner;

public class StringArrayScanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many animals do you have?");
		int length = scan.nextInt();

		String[] animals = new String[length];

		for (int j = 0; j <animals.length; j++) {
			System.out.println("Give me a name of animal");
			String names = scan.next();
			animals[j]=names;
		}

		
		
		for (String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("Print in reverse order");
		
		for(int i=animals.length-1;i>=0;i--) { //if there is 3,(means 0,1,2) i want to start from 2
			String str=animals[i];
			System.out.println(str);
		}
		
	}
}
