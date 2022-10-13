/*
 Program 4.  Create a custom exception (Name cannot be null). 
 The user will enter student details, it will throw an exception if the name or id is null.
 @Author: Snehasish
 @Date: 13th Oct, 2022
 */

package com.q4;

public class NewCustomException extends NullPointerException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// creating a new custom exception
	public NewCustomException() {
		System.out.println("Name or id can't be Null ");
	}
}
