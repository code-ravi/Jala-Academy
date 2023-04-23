//2. Print instance variables in static methods
package com.statics;

public class Two {
	int num = 10;

	// instance variables can not be accessed directly from static methods but we can do it alternate way
	public static void printNum() {
		Two obj = new Two();
		System.out.println("num = " + obj.num);
	}

	public static void main(String[] args) {
		printNum();

	}

}
