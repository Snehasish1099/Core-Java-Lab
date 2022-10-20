package com.EmployeeManagementSystem.EmployeeDaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.EmployeeManagementSystem.EmployeeDao.EmployeeDao;
import com.EmployeeManagementSystem.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	Scanner sc = new Scanner(System.in);

	// list of employee
	List<Employee> eList = new ArrayList<>();

	@Override
	public void add() { // add method implementation
		// TODO Auto-generated method stub
		Employee emp = new Employee();

		System.out.println("Enter the Employee Id  :");
		emp.setEmpId(sc.nextInt());

		System.out.println("Enter the Employee Name  :");
		emp.setEmpName(sc.next());

		System.out.println("Enter the Employee Salary  :");
		emp.setEmpSalary(sc.nextFloat());

		eList.add(emp);

	}

	@Override
	public boolean delete(int id) { // delete method implementation
		// TODO Auto-generated method stub

		boolean status = false;
		Employee Empl = null;

		for (Employee e : eList) {
			if (e.getEmpId() == id) {
				Empl = e;
				status = true;
			}
		}

		if (Empl == null) {
			status = false;
		} else {
			eList.remove(Empl);
		}

		return status;
	}

	@Override
	public Employee find(int id) { // find method implementation
		// TODO Auto-generated method stub
		Employee Empl = null;

		for (Employee e : eList) {
			if (e.getEmpId() == id) {
				Empl = e;
			}
		}
		return Empl;

	}

	@Override
	public void display() { // display method implementation
		// TODO Auto-generated method stub

		System.out.println(eList);

	}
}
