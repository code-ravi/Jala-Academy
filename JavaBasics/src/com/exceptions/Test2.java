//2. Handle the Arithmetic exception using try-catch block
package com.exceptions;

public class Test2 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;

			int div = a / b; // Divide by zero, resulting in an ArithmeticException
			System.out.println("Result: " + div);

		} catch (Exception e) {
			System.out.println("Don't divide by zero");
		}

	}
}
