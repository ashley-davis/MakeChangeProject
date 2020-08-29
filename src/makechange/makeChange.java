package makechange;

import java.util.Scanner;

public class makeChange {
	static double paid;
	static boolean canContinue = true;
	static Scanner kb = new Scanner(System.in);
	static double price;

	public static void main(String[] args) {
		System.out.println("Enter price: ");
		price = kb.nextDouble();
		System.out.println("Enter amount customer paid: ");
		paid = kb.nextInt();
		double changeOwed = paid - price;
//		while (canContinue) {
//			printMenu();
//			int userInput = kb.nextInt();
//			if (userInput == 2) {
//				canContinue = false;
//			}
//		}

		if (changeOwed == 0) {
			exactChange();
			printMenu();

		}
		if (price > paid) {
			notEnough();
		}

		if (paid > price) {
			change(changeOwed);
			printMenu();
		}
	}

//		calculateChange() Create method to calculate no. of bills/ coins 

	private static void change(double changeOwedParameter) {
		System.out.println("Your change is " + changeOwedParameter);
	}

	private static void printMenu() {
		System.out.println("Press 1 to make change again.\nPress 2 to quit. ");

	}

	private static void exactChange() {
		System.out.println("This is exact change. ");
	}

	private static void notEnough() {
		System.out.println("This isn't enough money. Enter an amount greater than " + paid);
	}
}
