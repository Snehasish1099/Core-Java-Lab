/*
 Program 2. Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
 and functionality . Create a test class		
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q2;

public class Hourly extends Employee {

	// parameterized constructor
	public Hourly(int id, String name) {
		super(id, name);
	}

	@Override
	public void calculateEmpSalary(int numOfHrs) {
		this.salary = numOfHrs * 500;
	}
}
