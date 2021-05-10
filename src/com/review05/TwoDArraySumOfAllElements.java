package com.review05;

public class TwoDArraySumOfAllElements {

	public static void main(String[] args) {
		
		int nums[][] = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		int sum=0;
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				
				
				sum+=nums[i][j];
				
				
				
			}
		}
		System.out.println(sum);
		
		
		
	}
}
