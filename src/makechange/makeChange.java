package makechange;

import java.util.Scanner;

public class makeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter price: ");
		double price = kb.nextDouble();
		System.out.println("Enter amount customer paid: ");
		double paid = kb.nextInt();
		double change = price - paid;

		if (change == 0) {
			System.out.println("This is exact change. ");
		} else if (paid < price) {
			System.out.println("This isn't enough money. ");
		}
//		while(paid < price) {
//			System.out.println("Enter an amount greater than " + price);
//		}
//		Start again. Create a method that calls itself or do while loop.

		else {
			System.out.println("Your change is " + change);
		}

//		calculateChange();
//Create method to calculate no. of bills/ coins 
			
			
			


		
	}}

