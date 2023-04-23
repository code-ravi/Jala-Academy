//15. Write a program to generate NullPointerException
package com.exceptions;

public class Test15 {
	public static void main(String[] args) {

		try {
			// Attempt to call a method on a null object reference
			String myString = null;
			myString.length();
		} catch (NullPointerException e) {
			System.out.println("Exception caught: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
