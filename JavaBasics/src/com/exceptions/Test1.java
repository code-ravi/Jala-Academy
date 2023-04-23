//1. Write a program to generate Arithmetic Exception without exception handling
package com.exceptions;

public class Test1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;

		int div = a / b; // Divide by zero, resulting in an ArithmeticException
		System.out.println("Result: " + div);
	}
}
