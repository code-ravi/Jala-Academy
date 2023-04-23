//8. Write a program to find Armstrong number or not
package com.loops;

public class Eight {
	public static boolean isArmstrong(int n) {
		int num = n;
		int result = 0;
		while (n > 0) {
			int rem = n % 10;
			result = result + rem * rem * rem;
			n = n / 10;
		}
		return num == result;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153));

	}

}
