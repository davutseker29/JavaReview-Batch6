package com.review04;

import java.util.Scanner;

public class IntArrayScanner {

	public static void main(String[] args) {

		//use scanner to ask for the size of the array
		//then, read numbers from the scanner into the array
		//then print the whole array
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("size of the array");
		int size=scan.nextInt();
		System.out.println(size);
		
		
		
		int []nums=new int [size];
		
			for (int i=0; i<nums.length; i++) {
				System.out.println("Give me a number");	
				 nums[i]=scan.nextInt();
				
			}
			
			for (int numbers: nums) {
				
				System.out.println(numbers);
			}
		}
		
		
		
	}


