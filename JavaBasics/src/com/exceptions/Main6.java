package com.exceptions;

public class Main6 {
	public static void checkAge(int age) throws Test6MyException {
		if (age < 18) {
			throw new Test6MyException("Age must be greater than or equal to 18");
		}
		System.out.println("You are old enough to vote");
	}

	// Call the method that throws the custom exception
	public static void main(String[] args) {
		try {
			checkAge(15);
		} catch (Test6MyException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
