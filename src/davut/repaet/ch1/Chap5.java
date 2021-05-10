package davut.repaet.ch1;

public class Chap5 {

	public static void main(String[] args) {

		int temp = 95;

		if (temp >= 95) {
			System.out.println("its super hot");
		} else {
			System.out.println("not that hot");
		}

		boolean x = true;
		if (x) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}

		double budget = 10000;
		double carPrice = 13000;

		if (budget > carPrice) {
			System.out.println("i can afford to buy a car");
		} else if (budget == carPrice) {
			System.out.println("i cant afford");
		} else {
			System.out.println("i cant afford");
		}

		System.out.println("=========else if=========");

		double num1 = 10;
		double num2 = 10;

		if (num1 > num2) {
			System.out.println("number 2 is larger");
		} else if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("number 1 is larger");
		}

		System.out.println("====example from class====");

		boolean coldWeather = true;
		boolean buyShoes = true;
		int price = 30;

		if (coldWeather) {
			System.out.println("i will stay home");

		} else {
			System.out.println("i will go to mall");
		}
		if (buyShoes) {
			System.out.println("i will look at the store");
		} else {
			System.out.println("i will go find another store");
		}
		if (price <= 30) {
			System.out.println("i will buy the shoes");
		} else {
			System.out.println("look for cheaper");
		}

		// Write a Java program to get a number from the user and print whether it is
		// positive or negative. Go to the editor

		// Test Data
		// Input number: 35
		// Expected Output :
		// Number is positive

		int num = 35;

		if (num >= 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is negative");
		}

		System.out.println("===============second problem===========");

		int a, b, c;

		a = 1;
		b = 5;
		c = 1;

//		Take values of length and breadth of a rectangle from user and check if it is square or not.

		int z, y, w;
		z = 12;
		y = 24;
		w = 21;

		if (w == y && y == z) {
			System.out.println("it is equaltrial");
		} else if (w == y || w == z) {
			System.out.println("it is isoslace");

		} else {
			System.out.println("it is scalean");
		}

		System.out.println("===============if condition example===============");

		boolean married = true;
		boolean kids = true;
		int numKids = 2;

		if (married) {
			System.out.println("congrats");
		} else {
			System.out.println("get married");
		}
		if (kids) {
			System.out.println("how many kids");

		} else {
			System.out.println("why dont have");

		}
		if (numKids >= 2) {
			System.out.println("you should rent a house");
		} else {
			System.out.println("rent a condo");
		}

		/*
		 * if student completed a quiz we will check for a score if score is >90-->Great
		 * Job if score is >80-->Well done if score is >70-->you could have done better
		 * 
		 * if student did not complete the quiz--> not good please do homework ontime
		 */

		boolean compHW = true;
		int gpa = 87;

		if (compHW) {
			System.out.println("lets check for grade");

		}
		if (gpa >= 90) {
			System.out.println("great job");
		} else if (gpa > 80 && gpa < 90) {
			System.out.println("well done");
		} else if (gpa > 70 && gpa < 80) {
			System.out.println("you could have done better");
		} else {
			System.out.println("you failed");
		}

		System.out.println("=========================================");

		int priceH = 300000;
		double rate = 2.7;

		if (rate > 4.5) {
			System.out.println("rate is too high");
		} else {
			System.out.println("rate is good");
		}
		if (priceH > 200000) {
			System.out.println("i need a loan");
		} else {
			System.out.println("i dont need a loan");
		}

		int day = 7;

		if (day == 1) {
			System.out.println("it is Monday");
		} else if (day == 2) {
			System.out.println("it is Tuesday");
		} else if (day == 3) {
			System.out.println("it is Wednesday");
		} else if (day == 4) {
			System.out.println("it is Thursday");
		} else if (day == 5) {
			System.out.println("it is Friday");
		} else if (day == 6) {
			System.out.println("it is Saturday");
		} else {
			System.out.println("it is Sunday");
		}

		boolean job = true;
		int salary = 40000;

		if (job) {
			System.out.println("good gor you");
			if (salary > 35000) {
				System.out.println("not bad");
			} else {
				System.out.println("you should fine something else");
			}
		} else {
			System.out.println("get a job");
		}

		boolean classTdy = true;
		boolean flag = false;

		if (flag) {
			System.out.println("hello");
			if (classTdy) {
				System.out.println("hello friends");
			} else {
				System.out.println("hello family");
			}
		} else {
			System.out.println("bye");
		}

		boolean milk = true;
		int prc = 10;
		boolean cold = false;

		if (milk) {
			System.out.println("i want to learn the price");
			if (prc <= 10) {
				System.out.println("i can afford it");
				if (cold) {
					System.out.println("i am definitly buying");
				} else {
					System.out.println("need to ask");
				}
			} else {
				System.out.println("i cant afford it");
			}

		} else {
			System.out.println("bye");
		}

		System.out.println("===============last example================");

		double rt = 2.5;
		int hPrc = 250000;
		boolean seaShore = true;

		if (rt < 4) {
			System.out.println("i can think about it");
			if (hPrc <= 250000) {
				System.out.println("i can pay cash");
				if (seaShore) {
					System.out.println("i will definitly consider");
				} else {
					System.out.println("i need to talk with my wife");
				}
			} else {
				System.out.println("i need to take a loan");
			}
		} else {
			System.out.println("it is rip off");

		}

	}
}
