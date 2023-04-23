//14. Write a program to generate NoSuchMethodException
package com.exceptions;

public class Test14 {

	public static void main(String[] args) {

		try {
			// Attempt to call a non-existent method
			Class<?> clazz = MyClass.class;
			clazz.getDeclaredMethod("nonExistentMethod");
		} catch (NoSuchMethodException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

	private static class MyClass {
		private void myMethod() {
		}
	}
}
