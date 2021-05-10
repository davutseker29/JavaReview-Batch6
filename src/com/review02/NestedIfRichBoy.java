package com.review02;

import java.util.Scanner;

public class NestedIfRichBoy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Are you a boy or girl?");
		String boyGirl = scan.next();

		System.out.println("Are you rich true/false?");
		boolean rich = scan.nextBoolean();

		System.out.println("You are rich: " + rich);

		if (boyGirl.equals("boy")) {
			// boy
			System.out.println("Yaaaayyyy");// rich boy
			if (rich) {
				System.out.println("buy a ferrari");
			} else {
				System.out.println("play soccer");
			}

		} else if (boyGirl.equals("girl")) {
			System.out.println("yay"); // girl
			if (rich) {
				System.out.println("go shopping");
			} else {
				System.out.println("read a book");
			}

		} else { // neither boy nor girl
			System.out.println("You enetered a wrong choice.");
		}
		
		System.out.println("We are done");
	}
}
