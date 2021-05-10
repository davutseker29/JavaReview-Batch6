package com.review04;

public class ArrayDemo02 {

	public static void main(String[] args) {

		int [] numbers= {4,6,8,9,15};
		
		
		System.out.println("The size of the array:"+numbers.length);
		
		for (int number:numbers) {
			
			
			System.out.println(number);
		}
		
		System.out.println("==================for loop=================");
		
		
		for (int i=0; i<numbers.length;i++) {
			
			System.out.println(numbers[i]);
		}
	}

}
