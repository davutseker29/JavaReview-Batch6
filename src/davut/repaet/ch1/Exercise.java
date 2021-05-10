package davut.repaet.ch1;

import java.util.Scanner;

public class Exercise {
	
	public static void main(String[] args) {
		
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("how many do you want?");
		double quant=scan.nextDouble();
		double price;
		if(quant>1000) {
			
			price=100*0.1*quant;
			
		}else {
			price=100*quant;
		}
		System.out.println("total cost is "+price);
	}

}
