//1. "Suppose you have a Piggie Bank with an initial amount of $50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of $50. Now make two constructors of this class as follows:
//a) without any parameter - no amount will be added to the Piggie Bank                
//b) having a parameter which is the amount that will be added to the Piggie Bank                
//Create an object of the 'AddAmount' class and display the final amount

//@author: Snehasish
//@date: 

package com.piggybank;

import java.util.Scanner;

public class PiggyBankTest extends AddAmount {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to add: ");
		AddAmount a = new AddAmount(sc.nextDouble());
		a.displayAmount();

		char choice;
		while (true) {
			System.out.println("Do you want to add more?: ");
			choice = sc.next().toLowerCase().charAt(0);
			if (choice == 'y') {
				System.out.println("Enter the amount you want to add again: ");
				double moreMoney;
				moreMoney = sc.nextDouble();
				moreMoney += a.getFinalAmount();
				a.setFinalAmount(moreMoney);
				System.out.println(moreMoney);
			} else
				break;
		}

	}
}