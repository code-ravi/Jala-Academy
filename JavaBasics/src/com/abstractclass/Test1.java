//1. Create an abstract class with abstract and non-abstract methods.
package com.abstractclass;

abstract class Test1 {
	abstract void eat();

	static void legs() {
		System.out.println("This animal has 4 legs");
	}

	public static void main(String[] args) {
		legs();
	}
}
