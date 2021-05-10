package com.review04;

import java.util.Scanner;

public class ArraySum {
	
	public static void main(String[] args) {
		 
		int []numbers = {34,67,3,93,56,72,17,33};
		
		int sum=0;
		
		for (int i=0;i<numbers.length;i++) {
			
			sum +=numbers[i];
			
			
		}
		System.out.println(sum);
		System.out.println("=================");
		
		int total=0;
		for (int number:numbers) {
			total +=number;
		}
		System.out.println(total);
		
		Scanner scan = new Scanner(System.in);

		System.out.println("How many animals do you have?");
		int length = scan.nextInt();

		String[] animals = new String[length];

		for (int i = 0; i <animals.length; i++) {
			System.out.println("Give me a name of animal");
			String names = scan.nextLine();
			
		}

		System.out.println(animals);
	}

}
