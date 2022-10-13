/*
 Program 2. Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
 and functionality . Create a test class		
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q2;

import java.util.Scanner;

public class TestEmployee {

	// calling main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Create hourly employee
		System.out.println("Hourly Employee...");
		Hourly emp1 = new Hourly(0, null);

		// taking inputs from the user
		System.out.println("Id: ");
		emp1.setId(sc.nextInt());
		System.out.println("Name: ");
		emp1.setName(sc.next());

		System.out.println("Duration of work: ");
		int t1 = sc.nextInt(); // passing number of hours
		emp1.setId(t1);
		emp1.calculateEmpSalary(t1);

		// prints details of the employee
		System.out.println("Employee Id : " + emp1.getId());
		System.out.println("Employee Name : " + emp1.getName());
		System.out.println("Employee Salary per day : " + emp1.getSalary());

		System.out.println("..................................................");

		// Create Salaried employee
		System.out.println("Salaried Employee...");
		Salaried emp2 = new Salaried(0, null);

		// taking inputs from the user
		System.out.println("Id: ");
		emp2.setId(sc.nextInt());
		System.out.println("Name: ");
		emp2.setName(sc.next());

		System.out.println("Duration of work: ");
		int t2 = sc.nextInt(); // passing number of months
		emp2.setId(t2);
		emp2.calculateEmpSalary(t2);

		// prints details of the employee
		System.out.println("Employee Id : " + emp2.getId());
		System.out.println("Employee Name : " + emp2.getName());
		System.out.println("Employee Salary in a month : " + emp2.getSalary());

		sc.close();
	}
}