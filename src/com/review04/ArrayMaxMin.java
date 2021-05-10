package com.review04;

public class ArrayMaxMin {

	public static void main(String[] args) {

		//max number
		
		int []numbers = {34,67,3,93,56,72,17,33};
		
		int largest= numbers[0];
		
		for (int num:numbers) {
			
			if(num>largest) {
				largest=num;
				
				
			}
			
		}
		System.out.println(largest);
		System.out.println("============================");
		
		int greatest=0;
		
		for(int i=0;i<numbers.length;i++) {
			
			if (numbers[i]>greatest) {
				
				greatest=numbers[i];
			}
		}
		System.out.println(greatest);
		
		System.out.println("===========================");
		
		int smallest=numbers[0];
		for(int number:numbers) {
			
			if(smallest>number) {
				smallest=number;
			}
		}
		System.out.println(smallest);
		
		
		
		System.out.println("=====================");
		
		int tinies=numbers[0];
		
		for(int i=0; i<numbers.length;i++) {
			if (numbers[i]<tinies) {
				tinies=numbers[i];
			}
		}
		
		System.out.println(tinies);
		
	}

}
