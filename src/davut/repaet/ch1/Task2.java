package davut.repaet.ch1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		/* create a program that will be asking user to apply for a credit card 10 times
		 * as soon as get an "yes" from a user program should stop asking
		 */
		Scanner scan=new Scanner(System.in);
		String ans;
		for(int i=0; i<=10; i++) {
			System.out.println("would you like to apply for credit card?");
			ans=scan.nextLine();
			if(ans.equals("Yes")) {
				break;
			}
		}System.out.println("congrats");
		
	
		
		
	}

}
