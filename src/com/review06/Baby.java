package com.review06;

public class Baby {

	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;

	public void walk() {
		System.out.println("Crwaling...");
	}

	public String cry() {
		System.out.println("Cry every minute...");

		return "dont cry";
	}

	public void talk(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Bla Bla Bla...");
		}

	}

	public void disPlayBabyInfo() {
		System.out.println("full name of baby is " + firstName + " " + lastName);
		System.out.println("Hair color is " + hairColor);
		System.out.print("Gender is ");
		if (gender == 'M') {
			System.out.println("Boy");
		} else if (gender == 'F') {
			System.out.println("Girl");

		} else {
			System.out.println("unknown");
		}
	}

	public static void main(String[] args) {

		Baby obj = new Baby();

		obj.firstName = "John";
		obj.lastName = "Smith";
		obj.gender = 'M';
		obj.weight = 7;
		obj.hairColor = "blonde";

		System.out.println("baby firstname is " + obj.firstName);
		obj.cry();
		obj.walk();
		obj.disPlayBabyInfo();
		System.out.println("====================done with baby one====================");

		Baby obj2 = new Baby();

		obj2.firstName = "Selin";
		obj2.lastName = "Atasoy";
		obj2.gender = 'F';
		obj2.hairColor = "Black";
		obj.weight = 6;

		obj2.disPlayBabyInfo();

	}
}
