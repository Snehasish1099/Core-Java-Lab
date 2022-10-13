/*
 Program 4.  Create a custom exception (Name cannot be null). 
 The user will enter student details, it will throw an exception if the name or id is null.
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q4;

import java.util.Scanner;

public class StudentDetails {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NewCustomException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of the student");
		// taking inputs from the user
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the id: ");
		int id = sc.nextInt();

		if (id == 0 || name.isEmpty()) {
			throw new NewCustomException();
		}
		sc.close();
	}

}