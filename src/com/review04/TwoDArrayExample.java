package com.review04;

public class TwoDArrayExample {

	public static void main(String[] args) {

//		1D-Array is married to for loop
//		2D-Array is married to nested for loop
		
		int [][] numbers2= {{5,6,8,},
				{9,2,3}
				};
		
		int rows=numbers2.length; //how many rows
		
		int col=numbers2[0].length; // how many columns in first row
		
		for (int i=0; i<numbers2.length; i++) {
			System.out.println("I am in the "+i+ " row");
			
			for (int j=0; j<numbers2[i].length; j++){
				
				
				System.out.println("the value is "+numbers2[i][j]);
			}
			
			System.out.println();
		}
		
		
	}

}
