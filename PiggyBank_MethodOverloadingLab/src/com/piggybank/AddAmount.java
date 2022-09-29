//1. "Suppose you have a Piggie Bank with an initial initialAmount of $50 and you have to add some more initialAmount to it. Create a class 'AddinitialAmount' with a data member named 'initialAmount' with an initial value of $50. Now make two constructors of this class as follows:
//a) without any parameter - no initialAmount will be added to the Piggie Bank                
//b) having a parameter which is the initialAmount that will be added to the Piggie Bank                
//Create an object of the 'AddinitialAmount' class and display the final initialAmount

//@author: Snehasish
//@date: 

package com.piggybank;

public class AddAmount {
	// creating instance variables
	private double initialAmount = 50;
	private double addAmount;
	private double finalAmount;

	// Default constructor
	public AddAmount() {

	}

	// Parameterized constructor
	public AddAmount(double addAmount) {

		finalAmount = initialAmount + addAmount;
	}

	public void displayAmount() {
		// TODO Auto-generated method stub
		System.out.println("Final Amount: " + finalAmount);
	}

	// getter and setter for initialAmount, addAmount and finalAmount

	public double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}

	public double getAddAmount() {
		return addAmount;
	}

	public void setAddAmount(double addAmount) {
		this.addAmount = addAmount;
	}

	public double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}

	@Override
	public String toString() {
		return "AddAmount [initialAmount=" + getInitialAmount() + ", addAmount=" + addAmount + "]";
	}

}
