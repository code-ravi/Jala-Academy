//5. Write a program to throw exception with your own message
package com.exceptions;

public class Test5 {
	public static void main(String[] args) {
		try {
			int x = 25;
			int y = 0;
			System.out.println(x / y);
		} catch (Exception e) {
			System.out.println("Don't divide by zero");
		}
	}

}
