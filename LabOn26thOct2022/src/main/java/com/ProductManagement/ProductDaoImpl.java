package com.ProductManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {
	// create array list
	ArrayList<Product> products = new ArrayList();
	Scanner sc = new Scanner(System.in);

	//method for adding products.....(1)
	public void addProduct() {
		Product p = new Product();

		System.out.println("Enter product Id :");
		p.setProductId(sc.nextInt());

		System.out.println("Enter product name :");
		p.setProductName(sc.next());

		System.out.println("Enter product quantity :");
		p.setProductQuantity(sc.nextInt());

		System.out.println("Enter product price :");
		p.setProductPrice(sc.nextInt() * p.getProductQuantity());

		products.add(p);
		System.out.println("PRODUCT ADDED");
	}

	//method for deleting product...(2)
	public void deleteProduct() {
		Product p = new Product();
	
		System.out.println("Enter product Id :");
		int pId = sc.nextInt();
		
		Product delProduct = null;
		boolean isFound = false;

		for (Product i : products) {
			if (pId == i.getProductId()) {
				delProduct = i;
				isFound = true;
			}
		}
		if (isFound) {
			products.remove(delProduct);
			System.out.println("PRODUCT DELETED");
		}
		else {
			System.out.println("NO PRODUCT FOUND");
		}

	}

	//method for displaying all the products....(3)
	public void displayAllProduct() {
		System.out.println("ALL PRODUCTS: ");
		products.forEach(product -> System.out.println(product));
	}

	//method for sorting price.....(4)
	public void sortByPrice() {
		System.out.println("Enter the price to sort :");
		int price = sc.nextInt();

		System.out.println("1. Price greater than");
		System.out.println("2. Price lower than");
		System.out.println("Enter choice");
		int ch = sc.nextInt();

		if (ch == 1) {
			System.out.println("PRODUCTS ABOVE PRICE " + price);
			for (Product i : products) {
				if (i.getProductPrice() > price) 
					System.out.println(i);
			} 
		}
		else {
			System.out.println("PRODUCTS BELOW PRICE " + price);
			for (Product i : products) 
			{
				if (i.getProductPrice() < price) 
					System.out.println(i);
			}
		} 
	}

	// method for sorting quantity....(5)
	public void sortByQuantity() {
		System.out.println("Enter the quantity to sort :");
		int quantity = sc.nextInt();

		System.out.println("1. Quantity greater than");
		System.out.println("2. Quantity lower than");

		System.out.println("Enter choice");
		int ch = sc.nextInt();

		if (ch == 1) {
			System.out.println("PRODUCTS ABOVE QUANTITY " + quantity);
			for (Product i : products) {
				if (i.getProductQuantity() > quantity) {
					System.out.println(i);
				} 
			}
		}
		else {
			System.out.println("PRODUCTS BELOW QUANTITY " + quantity);
			for (Product i : products) {
				if (i.getProductQuantity() < quantity) {
					System.out.println(i);
				}
			}
		}
	}

}