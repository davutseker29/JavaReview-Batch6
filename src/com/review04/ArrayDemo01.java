package com.review04;

public class ArrayDemo01 {

	public static void main(String[] args) {

		// silly way
		int a1 = 5;
		int a2 = 7;
		int a3 = 8;
		int a4 = 9;
		int a5 = 20;
		//System.out.println(a1);
		//System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a4);
		//System.out.println(a5);

		//professional way
		
		//1.step declaring variable
		int [] numbers=new int [5];
		
		//2.step initializing values for array elements
		
		numbers[3]=9;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//printing the element with index 2 as a third element
		
		System.out.println("printing the element with index 2 as a third element ");
		
		int i=2;
		System.out.println(numbers[i]); //instead of using 2, i plugged in i
		
		i++;//this means i=3 and now instead of saying numbers [3] i will say i again
		
		System.out.println(i);
		
		int arraySize=numbers.length;
		System.out.println(arraySize);
		//1st way using for loop 
		//this method prints from stars point to end point like 0 to 4
		System.out.println("using for loop");
		for (int j=0; j<arraySize; j++) {
			System.out.println(numbers [j]);
			
			
		}
		//2nd way using for-each/advanced/enhanced loop
		//this method prints everything
		System.out.println("using for-each or advanced or enhanced loop");
		for (int number:numbers) {
			System.out.println(number);
		}
		
		
		
		
		
		
		
		
	}

}
