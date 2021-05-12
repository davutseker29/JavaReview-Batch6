package davut.repaet.ch1;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		// write a program to calculate sum of odds and even numbers from 1 -99

		int sumEven = 0;
		int sumOdd = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else if (i % 2 != 0) {
				sumOdd = sumOdd + i;
			}
		}
		System.out.println("sum of even numbers is " + sumEven);
		System.out.println("sum of odd numbers is " + sumOdd);
		
		/*write a program that print numbers 1-20
		 * i dont want to print 5,6,7
		 */
		
		for(int x=1; x<=20;x++) {
			if(x>=5 && x<=7) {
				continue;
			}
			System.out.print(x+" ");
		}
		
		
		
	
		
	}

}
