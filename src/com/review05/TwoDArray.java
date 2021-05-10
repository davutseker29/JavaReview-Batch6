package com.review05;

public class TwoDArray {

	public static void main(String[] args) {

		// 1st Way
		int[][] numbers = new int[3][4];

		// Lets print 3rd element in 2nd row

		System.out.println(numbers[1][2]); // since values are not initialized they are all "0"

		// lets initialzie values for second row= row index 1

		numbers[1][0] = 9;
		numbers[1][1] = 6;
		numbers[1][2] = 2;
		numbers[1][3] = 8;

		// lets iniitalize values for first row= row index 0

		numbers[0][0] = 7;
		numbers[0][1] = 1;
		numbers[0][2] = 6;
		numbers[0][3] = 12;

		// lets initialize values for third row = row index 2

		numbers[2][0] = 3;
		numbers[2][1] = 0;
		numbers[2][2] = 8;
		numbers[2][3] = 5;

		// 2nd Way

		int numbers2[][] = { { 7, 1, 6, 12 },
							 { 9, 6, 2, 8 }, 
							 { 3, 0, 8, 5 } };
		
		int rowIndex0= numbers[0].length;  //length of first row
		int rowIndex1= numbers[1].length;  //length of second row
		int rowIndex2= numbers[2].length;  //length of third row
		
		System.out.println(rowIndex0);
		System.out.println(rowIndex1);
		System.out.println(rowIndex2);
		
	}
}
