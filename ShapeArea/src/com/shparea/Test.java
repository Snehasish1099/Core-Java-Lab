/*
 Program: 4. We have to calculate the area of a rectangle, a square and a circle. 
 			Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. 
 			The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. 
 			Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. 
 			Create an object of class 'Area' and call all the three methods.	
 
 @Author : Snehasish
 @Date: 6th Oct, 2022	
 */

package com.shparea;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Area a = new Area();

		// Rectangle
		System.out.println("Length: ");
		float length = sc.nextFloat();
		System.out.println("Breadth: ");
		float breadth = sc.nextFloat();
		a.RectangleArea(length, breadth);

		// Square
		System.out.println("Side: ");
		float side = sc.nextFloat();
		a.SquareArea(side);

		// Circle
		System.out.println("Radius: ");
		float radius = sc.nextFloat();
		a.CircleArea(radius);

		sc.close();
	}
}
