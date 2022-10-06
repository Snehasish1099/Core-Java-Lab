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

public class Area extends Shape {

	double Area = 0; // Initializing the default value as 0

	// Implementing methods from the superclass
	@Override
	void RectangleArea(float length, float breadth) {
		// TODO Auto-generated method stub
		Area = length * breadth;
		System.out.println(" " + Area);

	}

	@Override
	void SquareArea(float side) {
		// TODO Auto-generated method stub
		Area = Math.pow(side, 2);
		System.out.println(" " + Area);

	}

	@Override
	void CircleArea(float radius) {
		// TODO Auto-generated method stub
		double pi = 3.1416;
		Area = pi * Math.pow(radius, 2);
		System.out.println(" " + Area);

	}

}
