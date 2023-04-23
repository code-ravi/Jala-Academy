/*1. Create a class with PRIVATE fields, private method and a main method. 
Print the fields in main method. Call the private method in main method. 
Create a sub class and try to access the private fields and methods from sub class.*/

//Answer: private fields and methods are accessible in same class.
package com.accessmodifiers.Test1;

public class Parent {
	private int x = 10;
	private int y = 15;

	private void sum() {
		System.out.println("Sum of x and y = " + (x + y));
	}

	public static void main(String[] args) {
		Parent ob = new Parent();
		// printing the fields
		System.out.println(ob.x);
		System.out.println(ob.y);
		// calling method
		ob.sum();
	}

}
