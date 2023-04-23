//9. Write a program to generate ArrayIndexOutOfBoundException
package com.exceptions;

public class Test9 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 5, 6 };

		// Attempt to access an index that is out of bounds
		int outOfBoundsNumber = numbers[6];
		System.out.println("Number: " + outOfBoundsNumber);
	}
}
