package com.StudentFeesManagement;

//instance variables
public class StudentDetails {
	private int id;
	private String name;
	private String courseName;
	private double fees;
	private String feesStatus;
	
	//No argument constructor
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public StudentDetails(int id, String name, String courseName, double fees, String feesStatus) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
		this.fees = fees;
		this.feesStatus = feesStatus;
	}
	
	//getters & setters for...
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getFeesStatus() {
		return feesStatus;
	}
	public void setFeesStatus(String feesStatus) {
		this.feesStatus = feesStatus;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", fees=" + fees
				+ ", feesStatus=" + feesStatus + "]";
	}
	
}
