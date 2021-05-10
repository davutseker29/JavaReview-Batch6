package com.review05;

public class TwoDArraySumEachRow {

	public static void main(String[] args) {
		
		int nums[][] = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		int [] sum= new int [nums.length];
		
		for (int i=0; i <nums.length; i++) {
			for (int j=0; j<nums[i].length;j++) {
				
				int element=nums[i][j];
				
				sum[i]+=element;
				

			}
			
		}
		for(int element: sum)
			
		System.out.println(element);
		
		
		
	}
}
