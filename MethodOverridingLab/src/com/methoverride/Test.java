/*
 Program: 2. Create a Class student which is inherited by college and school student.
  				Override the method. Calculate average marks.		
 @Author : Snehasish
 @Date: 6th Oct, 2022	
 */

package com.methoverride;

import java.util.Scanner;

public class Test {
	// method for finding average of College's student
	static void calculateAvg(College c) {

		double total = c.getMaths() + c.getPhysics();
		double avg = total / 2;
		c.setAvg(avg);
		System.out.println("Avarage marks of " + c.getName() + " is " + c.getAvg());
	}

	// method for finding average of School's student
	static void calculateAvg(School s) {

		double total = s.getMaths() + s.getPhysics() + s.getStatistics();
		double avg = total / 3;
		s.setAvg(avg);
		System.out.println("Avarage marks of " + s.getName() + " is: " + s.getAvg());
	}

	// main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// For College
		College c = new College(null, 0, 0, 0, 0);

		System.out.println("College Student name : ");
		c.setName(sc.next());
		System.out.println("Maths : ");
		c.setMaths(sc.nextDouble());
		System.out.println("Physics : ");
		c.setPhysics(sc.nextDouble());
		calculateAvg(c);

		System.out.println("-----------");

		// For School
		School s = new School(null, 0, 0, 0, 0);

		System.out.println("School Student name : ");
		s.setName(sc.next());
		System.out.println("Maths : ");
		s.setMaths(sc.nextDouble());
		System.out.println("Physics : ");
		s.setPhysics(sc.nextDouble());
		System.out.println("Statistics : ");
		s.setStatistics(sc.nextDouble());
		calculateAvg(s);

		sc.close();
	}

}
