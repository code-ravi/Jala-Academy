//Question 5. Define the local and Global variables with the same name and print both variables and understand the scope of the variables
package com.javabasics;

public class Five {
	
	static String name = "Jala Academy";
	
	public static void main(String[] args) {
		String name = "Ravi Ranjan Kumar";
		// Global or Class level variable has scope throughout the class and stored in either Heap/Object(non-static) or in Class Info Area(static)
		
		System.out.println("This is Global Variable: "+ name);
		System.out.println("This is Local Variable: "+ Five.name);
		
		// Local Variable has block scope and stored in stack memory
		
	}
}
