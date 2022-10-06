/*
 Program: 2. Create a Class student which is inherited by college and school student.
  				Override the method. Calculate average marks.		
 @Author : Snehasish
 @Date: 6th Oct, 2022	
 */

package com.methoverride;

public class School extends Student {

	public School(String name, double maths, double physics, double statistics, double avg) {
		super(name, maths, physics, statistics, avg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setAvg(double avg) {
		// TODO Auto-generated method stub
		super.setAvg(avg);
	}

}
