package com.StudentFeesManagement;


import java.util.HashMap;
import java.util.Scanner;


public class StudentCollectionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// creating a hashmap
		HashMap<String, StudentDetails> sDetails = new HashMap<>();
		String uniqueID;

		StudentDetails sInfo = new StudentDetails();
		
		sDetails.put("1A1001", new StudentDetails(01, "SNEHASISH MONDAL", "MCA", 150000, "PAID"));
		sDetails.put("2B1002", new StudentDetails(02, "SNE HA SISH", "B.SC HONS.(PHYSICS)", 20000, "PARTIALLY PAID"));
		sDetails.put("3C1003", new StudentDetails(03, "???SNEHASISH???", "JAVA", 0, "NOT PAID"));
		
		System.out.println("Enter the student UNIQUE ID :");
		uniqueID = sc.next();
		
		boolean status = sDetails.containsKey(uniqueID);

		// displaying the information
		if (status) 
		{
			System.out.println("STUDENT  DETAILS AS PER DATABAS");
			sInfo = sDetails.get(uniqueID);
			System.out.println(sInfo);

		}

		else 
			System.out.println("STUDENT  DETAILS NOT FOUND IN THE DATABASE");
		
		sc.close();


	}

}
