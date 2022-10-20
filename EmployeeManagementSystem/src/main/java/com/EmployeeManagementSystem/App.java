package com.EmployeeManagementSystem;

import java.util.Scanner;

//import packages
import com.EmployeeManagementSystem.EmployeeDao.EmployeeDao;
import com.EmployeeManagementSystem.EmployeeDaoImpl.EmployeeDaoImpl;
import com.EmployeeManagementSystem.model.Employee;

/**
 * Hello world!
 *
 */
public class App {

	// Menu method
	public static void Menu() {
		System.out.println("MENU:");
		System.out.println("1. Add Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Find Employee");
		System.out.println("4. Display all the Employees");
		System.out.println("5.Exit");
	}

	// main method
	public static void main(String[] args) {

		// For coloring
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_RED_BACKGROUND = "\u001B[41m";

		// object of EmployeeDaoImpl
		EmployeeDao employee = new EmployeeDaoImpl();

		// scanner class
		Scanner sc = new Scanner(System.in);
		int ch;

		do {
			Menu();
			System.out.println("Enter the Option :");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				// call add method
				employee.add();
				System.out.println("One Employee Added  ");
				break;
			case 2:
				System.out.println("Enter Employee id : ");
				int id = sc.nextInt();

				// call delete method
				boolean flag = employee.delete(id);
				if (flag) {
					System.out.println("One Employee Removed  ");
				} else {
					System.out.println(ANSI_RED_BACKGROUND + "Employee not found" + ANSI_RESET);
				}
				break;
			case 3:
				Employee ee;
				System.out.println("Enter Employee id : ");
				id = sc.nextInt();

				// call find method
				ee = employee.find(id);
				if (ee == null) {
					System.out.println(ANSI_RED_BACKGROUND + "Not Employee Found" + ANSI_RESET);
				} else {
					System.out.println("Employee id : " + ee.getEmpId() + " Employeee name : " + ee.getEmpName()
							+ " Employee salary : " + ee.getEmpSalary());
				}
				break;

			case 4:
				System.out.println("Heres the all Employee : ");

				// call display method
				employee.display();
				break;

			case 5:
				System.out.println(ANSI_RED_BACKGROUND + "System all out" + ANSI_RESET);
				System.exit(0);
				break;
			default:

				System.out.println(ANSI_RED_BACKGROUND + "Nothing is found!" + ANSI_RESET);
				break;
			}// end of switch case

		} while (ch != 5); // end loop
		sc.close();

	}// end main
}// end class
