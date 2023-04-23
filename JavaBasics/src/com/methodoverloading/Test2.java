/*2. Write two methods with the same name but different number of parameters of different data type 
 and call the methods from main method */
package com.methodoverloading;

public class Test2 {
	static void getSum(int x, String str) {
		System.out.println("Concatanation = " + (x + str));
	}

	static void getSum(int x, String str, float y) {
		System.out.println("Concatanation = " + (x + str + y));
	}

	public static void main(String[] args) {
		getSum(5, "Hello");
		getSum(5, "World", 20.5f);
	}

}
