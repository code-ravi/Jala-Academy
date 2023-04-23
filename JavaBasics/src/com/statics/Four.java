//4. Call instance methods in static methods
package com.statics;

public class Four {
	
	public void printSum(int a, int b) {
		System.out.println("Sum = "+ (a+b));
	}

	public static void main(String[] args) {
		Four ob = new Four();
		//calling instance method from static method
		ob.printSum(10, 20);

	}

}
