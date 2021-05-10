package com.review06;

public class ArrayManipulation {
	
	public int largestNumber(int [] nums) {
		
		int largest=nums[0];
		for(int i=0; i<nums.length;i++) {
		if(nums[i]>largest) {
			largest=nums[i];
		}
		}
		
		return largest;
	}
	int smallestNumbers(int []nums) {
		int smallest=nums[0];
		for(int smallestNum:nums) {
			if(smallestNum<smallest) {
				smallest=smallestNum;
				
			}
		}
		return smallest;
		
		
	}
	
	int sum(int []num) {
		int sum=0;
		for(int i=0; i<num.length;i++) {
			sum+=num[i];
		}
		
		
		return sum;
	}
	public static void main(String[] args) {
		
		ArrayManipulation obj=new ArrayManipulation();
		int[]nums= {5,4,7,4,9,8,3};
		
		obj.largestNumber(nums);
		System.out.println(obj.largestNumber(nums));
		// i can create a local variable
		int largest=obj.largestNumber(nums);
		System.out.println(largest);
		
		System.out.println(obj.smallestNumbers(nums));
		int smallest=obj.smallestNumbers(nums);
		System.out.println(smallest);

		System.out.println(obj.sum(nums));
		int sumAll=obj.sum(nums);
		System.out.println(sumAll);
}}
