/*
 Program: 1. Write a code to check a string is palindrome or not.
 
 @Author : Snehasish
 @Date: 6th Oct, 2022	
 */

package com.palndrm;

import java.util.Scanner;

public class PalindromeChecker {

	// Method for checking palindrome
	static boolean checkPalindrome(String str) {
		boolean status;
		char ch[] = str.toCharArray(); // extracts characters from the String and pushes them into array
		String revString = " "; // Empty string

		// loop for checking the order of the characters inside and reversing them until
		// the condition is met
		for (int i = ch.length - 1; i >= 0; i--) {
			revString += ch[i];
		}
		int flag = str.compareTo(revString);
		if (flag == 0)
			status = true;
		else
			status = false;
		return status;
	}

	// declaring main method
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();

		boolean check = checkPalindrome(s);
		if (check)
			System.out.println("The string is a palindrome: ");
		else
			System.out.println("The string is not a palindrome: ");

		sc.close();
	}
}
