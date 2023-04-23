//3. Write two methods with the same name and same number of parameters of same type and call from main method
//Answer: We can not overload method with same number of parameters of same type
package com.methodoverloading;

public class Test3 {
	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		multiply(5, 15);
		multiply(10, 5);
	}
}
