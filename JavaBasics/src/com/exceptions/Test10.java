//10. Write a program to generate ClassNotFoundException
package com.exceptions;

public class Test10 {

	public static void main(String[] args) {

		try {
			// Attempt to load a non-existent class
			Class.forName("NonExistentClass");
		} catch (ClassNotFoundException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
