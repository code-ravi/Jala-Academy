//17. Write a program to generate StringIndexOutOfBoundsException
package com.exceptions;

public class Test17 {

	public static void main(String[] args) {

		try {
			// Attempt to access an index beyond the end of the string
			String myString = "hello";
			char c = myString.charAt(10);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
