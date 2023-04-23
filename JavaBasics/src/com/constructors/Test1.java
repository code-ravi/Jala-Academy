/*1. Write a class with a default constructor, one argument constructor and two argument constructors.
 Instantiate the class to call all the constructors of that class from a main class */
package com.constructors;

public class Test1 {
	Test1() {
		System.out.println("I'm default constructor");

	}

	Test1(int a) {
		System.out.println("I'm one argument constructor, a= " + a);
	}

	Test1(int a, int b) {
		System.out.println("I'm two argument constructor, a= " + a + " , b= " + b);
	}

}
