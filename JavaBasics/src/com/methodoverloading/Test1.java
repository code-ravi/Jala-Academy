/*1. Write two methods with the same name but different number of parameters of same type 
and call the methods from main method */
package com.methodoverloading;

public class Test1 {
	static void getSum(int x, int y) {
		System.out.println("x+y = " + (x + y));
	}

	static void getSum(int x, int y, int z) {
		System.out.println("x+y+z = " + (x + y + z));
	}

	public static void main(String[] args) {
		getSum(5, 12);
		getSum(5, 12, 15);
	}

}
