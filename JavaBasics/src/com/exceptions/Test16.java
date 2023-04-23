//16. Write a program to generate NumberFormatException
package com.exceptions;

public class Test16 {

	public static void main(String[] args) {

		try {
			// Attempt to convert an invalid string to an integer
			String invalidString = "not an integer";
			int value = Integer.parseInt(invalidString);
		} catch (NumberFormatException e) {
			System.out.println("Exception caught: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
