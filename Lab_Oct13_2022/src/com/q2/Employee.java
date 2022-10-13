/*
 Program 2. Create a class Employee. Inherit 2 classes Hourly employee and Salaried Employee  
 and functionality . Create a test class		
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q2;

public class Employee {

	// variable instances
	private int id;
	private String name;
	protected int salary;

	// parameterized constructor
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	// getters and setters for the parameters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	// calculate empSalary
	public void calculateEmpSalary(int durationOfWork) {
		this.salary = 0;
	}
}
