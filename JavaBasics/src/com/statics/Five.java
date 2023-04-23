//5. Call static methods in instance methods
package com.statics;

public class Five {
	int a = 10;
	int b = 15;

	// instance method
	public void calculateSum() {
		int sum = a+b;
		// calling static method from instance method
		printSum(sum);
	}

	// static method
	public static void printSum(int sum) {
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		Five ob = new Five();
		ob.calculateSum();

	}

}
