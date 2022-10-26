package com.ProductManagement;

import java.util.Scanner;

// creating the class named AppTest
public class AppTest {
	// create printMenu method
	public static void printMenu() {
		System.out.println("1. ADD PRODUCT");
		System.out.println("2. DELETE PRODUCT");
		System.out.println("3. DISPLAY ALL PRODUCTs");
		System.out.println("4. SORT BY PRICE");
		System.out.println("5. SORT BY QUANTITY");
	}

	// calling the main method
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ProductDaoImpl pd = new ProductDaoImpl();
	
		boolean performOperations = true;
		while (performOperations) {
			printMenu();
			
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			//beginning of switch-case
			switch (ch) {
			case 1 -> pd.addProduct();
			case 2 -> pd.deleteProduct();
			case 3 -> pd.displayAllProduct();
			case 4 -> pd.sortByPrice();
			case 5 -> pd.sortByQuantity();
			}
		}
		sc.close();
	}
}