//7. Write a program with finally block
package com.exceptions;

public class Test7 {

	public static void main(String[] args) {

		try {
			int result = 10 / 0; // This line will throw an ArithmeticException
			System.out.println("Result: " + result); // This line will not be executed
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}
	}

}
