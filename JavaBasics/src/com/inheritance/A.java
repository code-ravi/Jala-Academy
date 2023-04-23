/*Question: 
 A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.
Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
Call an overridden method with super class reference to B and C class’s objects
Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members */

package com.inheritance;

public class A {
	int x =10;
	public void methodA1() {
		System.out.println("A.methodA1");
	}

	public void methodA2() {
		System.out.println("A.methodA2");
	}

	public void overrideMethod() {
		System.out.println("A.overrideMethod");
	}
}

class B extends A {
	int x =15;
	public void methodB1() {
		System.out.println("B.methodB1");
	}

	public void methodB2() {
		System.out.println("B.methodB2");
	}

	@Override
	public void overrideMethod() {
		System.out.println("B.overrideMethod");
	}
}

class C extends B {
	int x =20;
	public void methodC1() {
		System.out.println("C.methodC1");
	}

	public void methodC2() {
		System.out.println("C.methodC2");
	}

	@Override
	public void overrideMethod() {
		System.out.println("C.overrideMethod");
	}
}

