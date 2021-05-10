package com.review05;

public class TwoDArrayEnhanced {
	
	public static void main(String[] args) {
		
		int nums[][] = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		//iterating rows
		for(int[] row:nums) {
			
			//iterating elements of a row
			for(int element :row) {
				
				System.out.print(element+" ");
			}
			System.out.println();
		}
		
	}

}
