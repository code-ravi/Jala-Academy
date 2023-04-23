package com.inheritance;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();

		// call methods for each object
		a.methodA1();
		a.methodA2();
		a.overrideMethod();

		b.methodA1(); // inherited from A
		b.methodA2(); // inherited from A
		b.methodB1();
		b.methodB2();
		b.overrideMethod();

		c.methodA1(); // inherited from A
		c.methodA2(); // inherited from A
		c.methodB1(); // inherited from B
		c.methodB2(); // inherited from B
		c.methodC1();
		c.methodC2();
		c.overrideMethod();

		// runtime polymorphism with super class reference
		A superClassRef = new B();
		superClassRef.overrideMethod(); // calls B.overrideMethod

		superClassRef = new C();
		superClassRef.overrideMethod(); // calls C.overrideMethod

		// runtime polymorphism with data members/instance variables
		A ob = new B();
		System.out.println(ob.x);

		B ob1 = new C();
		System.out.println(ob1.x);
	}
}
