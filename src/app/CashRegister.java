package app;

import java.util.Scanner;

public class CashRegister {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double payment = 0;
		double price = 0;
		double cash = 0;

		System.out.println("Please enter the price of the item you wish to purchase: ");
		price = sc.nextDouble();

		System.out.println("Please enter the amount you're paying: ");
		payment = sc.nextDouble();

		cash = payment - price;

		if (payment < price) {
			System.out.println("Not enough cash! Cough up the dough, dude!");
		}

		if (payment == price) {
			System.out.println("Congratulations on your purchase!");
		}

		dollars(payment, price, cash);
		coins(payment, price, cash);

	}

	public static void dollars(double payment, double price, double cash) {
		while (cash > 0.99) {

			int hundreds, fifties, twenties, fives, tens, ones;

			hundreds = (int) (cash) / 100;

			cash -= (hundreds * 100);

			fifties = (int) cash / 50;

			cash -= (fifties * 50);

			twenties = (int) (cash) / 20;

			cash -= (twenties * 20);

			tens = (int) (cash) / 10;

			cash -= (tens * 10);

			fives = (int) (cash) / 5;

			cash -= (fives * 5);

			ones = (int) (cash) / 1;

			cash -= (ones * 1);

			if (hundreds >= 2) {
				System.out.println("You have " + hundreds + " hundreds.");
			} else if (hundreds > 1 && hundreds < 2) {
				System.out.println("You have " + hundreds + " hundred.");
			}
			if (fifties >= 2) {
				System.out.println("You have " + fifties + " fifties");
			} else if (fifties > 1 && fifties < 2) {
				System.out.println("You have " + fifties + " fifty.");
			}
			if (twenties >= 2) {
				System.out.println("You have " + twenties + " twenties.");
			} else if (twenties > .99 && twenties < 2) {
				System.out.println("You have " + twenties + " twenty.");
			}

			if (tens >= 2) {
				System.out.println("You have " + tens + " tens.");
			} else if (tens > .99 && tens < 2) {
				System.out.println("You have " + tens + " ten.");
			}
			if (fives >= 2) {
				System.out.println("You have " + fives + " fives.");
			} else if (fives > .99 && fives < 2) {
				System.out.println("You have " + fives + " five.");
			}
			if (ones >= 2) {
				System.out.println("You have " + ones + " ones.");
			} else if (ones > .99 && ones < 2) {
				System.out.println("You have " + ones + " one.");
			}

			;
		}
	}

	public static double coins(double payment, double price, double cash) {

		// while (cash > 0) {
		cash -= (int) (cash);

		cash = cash * 100;

		double quarters, dimes, nickels, pennies;

		double dime;

		/*
		 * quarters = (int) (cash/25); dimes = (int)((cash - (cash%25 * .25)*10));
		 * 
		 * pennies = 0; nickels = 0;
		 */

		quarters = cash / 25;

		// cash = cash - quarters*.25;
		cash = cash % 25;

		dime = cash / 10;

		cash = cash % 10;
		// cash = cash - dimes * .10;

		nickels = cash / 5;

		// cash = cash - nickels * 5;
		cash = cash % 5;

		pennies = cash / 1 + 0.0001;

		// cash = cash - pennies * 1 ;
		if (quarters > 2) {
			System.out.println("You have " + (int) quarters + " quarters.");
		} else if (quarters > .99 && quarters < 2) {
			System.out.println("You have " + (int) quarters + " quarter.");
		}

		if (dime > 2) {
			System.out.println("You have " + (int) dime + " dimes.");
		}
		if (dime >= 1.01 && dime < 2) {
			System.out.println("You have " + (int) dime + " dime.");
		}

		if (nickels > 2) {
			System.out.println("You have " + (int) nickels + " nickels.");
		} else if (nickels > .99 && nickels < 2) {
			System.out.println("You have " + (int) nickels + " nickel.");
		}

		if (pennies > 2) {
			System.out.println("You have " + (int) pennies + " pennies.");
		} else if (pennies > .99 && pennies < 2) {
			System.out.println("You have " + (int) pennies + " penny.");
		}

		return cash;

	}

}
