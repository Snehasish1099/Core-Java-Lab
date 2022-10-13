/*
 Program 3. Create a Account and perform synchronized withdrawal in it using Threads
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q3;

public class Account {

	private int balance = 1000; // initializing the default balance 1000

	public int getBalance() {
		return balance;
	}

	// creating method to calculate the remaining balance
	public void withDraw(int amount) {
		balance = balance - amount;
	}
}
