package com.EmployeeManagementSystem.EmployeeDao;

import com.EmployeeManagementSystem.model.Employee;

public interface EmployeeDao {

	void add();

	boolean delete(int id);

	Employee find(int id);

	void display();
}
