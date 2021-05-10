package com.review05;

public class TwoDArrayPrintingAllElements {

	public static void main(String[] args) {

		int nums[][] = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };

		int rows = nums.length;
		for (int i = 0; i < nums.length; i++) {
			System.out.println("i am at row index "+i);
			
			
		for (int j = 0; j < nums[i].length; j++) {
			
			System.out.print(nums[i][j]+" ");
			}
		System.out.println();
		}

	}
}
