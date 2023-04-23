//13. Write a program to generate NoSuchFieldException
package com.exceptions;

public class Test13 {

	public static void main(String[] args) {

		try {
			// Attempt to access a non-existent field
			Class<?> clazz = MyClass.class;
			clazz.getDeclaredField("nonExistentField");
		} catch (NoSuchFieldException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	private static class MyClass {
		private int myField;
	}
}
