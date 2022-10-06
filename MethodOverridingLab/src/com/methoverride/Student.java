/*
 Program: 2. Create a Class student which is inherited by college and school student.
  				Override the method. Calculate average marks.		
 @Author : Snehasish
 @Date: 6th Oct, 2022	
 */

package com.methoverride;

public class Student {

	//
	private String name;
	private double maths;
	private double physics;
	private double statistics;
	private double avg;

	//
	public Student(String name, double maths, double physics, double statistics, double avg) {
		super();
		this.name = name;
		this.maths = maths;
		this.physics = physics;
		this.statistics = statistics;
		this.avg = avg;
	}

	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public double getStatistics() {
		return statistics;
	}

	public void setStatistics(double statistics) {
		this.statistics = statistics;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", maths=" + maths + ", physics=" + physics + ", statistics=" + statistics
				+ ", avg=" + avg + "]";
	}

}
