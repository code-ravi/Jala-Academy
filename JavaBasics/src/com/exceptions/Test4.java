//4. Write a program with multiple catch blocks
package com.exceptions;

public class Test4 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;

			System.out.println(a / b);
			int arr[] = new int[10];
			System.out.println(arr[12]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array input");
		} catch (ArithmeticException ee) {
			System.out.println("Don't divide by zero");
		}
	}

}
