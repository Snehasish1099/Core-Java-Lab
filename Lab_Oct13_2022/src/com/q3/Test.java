/*
 Program 3. Create a Account and perform synchronized withdrawal in it using Threads
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q3;

import java.util.Scanner;

//calling the class
public class Test extends Thread {

	// creating the object acc
	Account acc = new Account();

	// performing synchronized method using threads where a is a joint account
	synchronized void makeWithDraw(int a) {

		if (acc.getBalance() >= a) {
			System.out.println(Thread.currentThread().getName() + " is going to wihtdraw " + a);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			acc.withDraw(a);
			System.out.println(Thread.currentThread().getName() + " took: " + a);

		} else {
			System.out.println(Thread.currentThread().getName() + " can't withdraw his desired money");
			System.out.println("Remaining amount is " + acc.getBalance());

		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to take "); // takes i/p from the user
		int p1 = sc.nextInt();
		makeWithDraw(p1);
		int p2 = sc.nextInt();
		makeWithDraw(p2);

		// if total balance remaining is less than 0
		if (acc.getBalance() < 0) {
			System.out.println("Overdrawn");
		}

		sc.close();
	}

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test acc = new Test();

		Thread t1 = new Thread(acc, "Snehasish");
		t1.start();

		Thread t2 = new Thread(acc, "Sne Ha Sish");
		t2.start();

	}
}
