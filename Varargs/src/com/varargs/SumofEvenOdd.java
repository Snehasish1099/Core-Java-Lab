//2. Write a program to print sum of even and odd numbers using varargs.	
//@author: Snehasish
//@date: 

package com.varargs;

//declaring class
public class SumofEvenOdd {

	// function for sum of even numbers
	public static int sumofEven(int... a) {
		int sumofEven = 0;
		for (int i : a) {
			if (i % 2 == 0) {
				sumofEven += i;
			}
		}
		return sumofEven;
	}

	// function for sum of odd numbers
	public static int sumofOdd(int... a) {

		int sumofOdd = 0;
		for (int i : a) {
			if (i % 2 != 0) {
				sumofOdd += i;
			}
		}
		return sumofOdd;
	}

	// Declaring main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum of even Numbers: " + sumofEven(5, 7, 8, 3, 20, 58, 6, 74));
		System.out.println("Sum of odd Numbers: " + sumofOdd(5, 7, 8, 3, 20, 58, 6, 74));
	}

}
