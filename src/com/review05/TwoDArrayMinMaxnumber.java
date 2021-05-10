package com.review05;

public class TwoDArrayMinMaxnumber {

	public static void main(String[] args) {
		
		int nums[][] = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		
		int min=nums[0][0];
		int max=nums[0][0];	
		for (int i=0;i<nums.length;i++) {
		for(int j=0; j<nums[i].length;j++) {
			
			int element=nums[i][j];
			if(element<min) {
				min=element;
				
			}
			
					
			int elements=nums[i][j];
			
			if(elements>max) {
				
				max=element;
			
				
			
			
		}
			
		}
		
			}
		
		System.out.println(max);
		System.out.println(min);
		
		
		
	}
}
