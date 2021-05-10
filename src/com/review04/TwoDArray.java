package com.review04;

public class TwoDArray {

	public static void main(String[] args) {

//		1st way of creating 2D-Array

		int[][] numbers = new int[2][3];

		// enter into array, into row index 0 and column index 2
		numbers[0][2] = 8;
		numbers[1][0] = 9;
		numbers[0][0] = 5;
		numbers[0][1] = 6;
		numbers[1][1] = 2;		
		numbers[1][2] = 3;

//		2nd way of crating 2D-Array
		
		int [][] numbers2= {{5,6,8,},
							{9,2,3}
							};
		
				
		System.out.println("Lets get some values from numbers2");
		
		int values=numbers[1][0];
		
		System.out.println("it should be 9.isnt it "+values);
	}

}
