package davut.repaet.ch1;

import java.util.Scanner;

public class Class8 {

	public static void main(String[] args) {

		/*
		 * print #s from 15 to 35 that dont print numbers that are divisible by 2 and 3
		 */

		for (int i = 15; i <= 35; i++) {

			if (i % 6 == 0) {

				continue;

			}
			System.out.print(i + " ");

		}
		System.out.println();

		for (int a = 15; a < 36; a++) {
			if (a % 2 == 0 && a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println();
		for (int x = 0; x <= 10; x++) {
			if (x == 4) {
				System.out.println("I am stopping the loop");
				break;
			}
			System.out.print(x + " ");
		}
		System.out.print(" ");
		for (int y = 1; y <= 10; y++) {
			if (y == 4) {
				System.out.println("i am skipping the loop");
				continue;
			}
			System.out.print(y+"-)");
			System.out.println(" i am inside the loop");
		}
		/*
		 * write a program that needs a range of integers(start and end point)
		 * provided by a user and then from that range prints the sum of the even
		 */
		System.out.println(" ");
		Scanner scan=new Scanner(System.in);
		System.out.println("please write a min number");
		int min=scan.nextInt();
		System.out.println("please write a max number");
		int max=scan.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		for(int n=min; n<max+1; n++) {
			if(n%2==0) {
				sumEven=sumEven+n;
			}else if(n%2!=0) {sumOdd=sumOdd+n;
			
		}
		
	}
		System.out.println(sumEven+" is sum of even numbers");
		System.out.println(sumOdd+" is sum of odd numbers");

}}
