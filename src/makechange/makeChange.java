package makechange;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

//Week One Project: A program to receive an amount from the user, calculate change, then show the denominations
//to be tendered.

public class MakeChange {

	private static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		System.out.println("Welcome to Make Change: Week One Project by Ashley Davis. ");
		System.out.println("This program calculates correct change at a cash register. ");
		System.out.println("");
		System.out.print("Enter price of item: ");
		Scanner kb = new Scanner(System.in);
		double price = kb.nextDouble();
		System.out.println("Enter amount paid by customer: ");
		double paid = kb.nextDouble();
		double change = paid - price;
		//
		if (price > paid) {
			notEnough(price);
		}

		if (price == paid) {
			exactChange();
		}
		if (paid > price) {
			giveChange(change);
		}
//		
		double remaining = (change * 100);

		int twenties = (int) (remaining / 2000);
		remaining = (remaining % 2000);

		int tens = (int) (remaining / 1000);
		remaining = remaining % 1000;

		int fives = (int) (remaining / 500);
		remaining = remaining % 500;
//		
		int dollars = (int) (remaining / 100);
		remaining = remaining % 100;
//		
		int quarters = (int) (remaining / 25);
		remaining = remaining % 25;
//		
		int dimes = (int) (remaining / 10);
		remaining = remaining % 10;
//		
		int nickels = (int) (remaining / 5);
		remaining = remaining % 5;
//		
		double pennies = remaining;
//		

		if (twenties != 0) {
			System.out.println(twenties + " twenties ");
		}

		if (tens != 0) {
			System.out.println(tens + " tens ");
		}
		if (fives != 0) {
			System.out.println(fives + " fives ");
		}
		if (dollars != 0) {
			System.out.println(dollars + " dollars ");

		}
		if (quarters != 0) {
			System.out.println(quarters + " quarters ");

		}
		if (dimes != 0) {
			System.out.println(dimes + " dimes ");
		}
		if (nickels != 0) {
			System.out.println(nickels + " nickels ");
		}
		if (pennies != 0) {
			df.setRoundingMode(RoundingMode.UP);
			System.out.println(df.format(pennies) + " pennies ");
		}

	}

	private static void giveChange(double change) {
		System.out.println("Change equals $" + change);

	}

	private static void notEnough(double price) {
		System.out.println("This isn't enough money. Enter an amount greater than " + "$" + price);
	}

	private static void exactChange() {
		System.out.println("This is exact change. ");
	}

//		Scanner kb.close;

}
