//13. Program for multiple if else statement(Largest number in 10,20 and 30)
package com.loops;

public class Thirteen {

	public static void main(String[] args) {
		int a = 10, b = 20, c = 30;

		// find largest number
		if (a > b) {
			if (a > c) {
				System.out.println("a is the largest number.");
			} else {
				System.out.println("c is the largest number.");
			}
		} else {
			if (b > c) {
				System.out.println("b is the largest number.");
			} else {
				System.out.println("c is the largest number.");
			}
		}

	}

}
