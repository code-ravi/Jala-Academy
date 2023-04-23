//4. Write two methods with the same name and same number of parameters of different type and call from main method
package com.methodoverloading;

public class Test4 {
	static int getSum(int a, int b) {
		return a + b;
	}

	static String getSum(String x, String y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(getSum(10, 15));
		System.out.println(getSum("Hello ", "Java"));
	}

}
