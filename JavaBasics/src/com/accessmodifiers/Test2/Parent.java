/*2. Create a class with DEFAULT fields and methods.
Access these fields and methods from any other class in the same package */

//Answer: DEFAULT fields and methods are accessible outside the class in same package
package com.accessmodifiers.Test2;

public class Parent {
	int x = 20;
	int y = 30;

	void difference() {
		System.out.println("Difference= " + (y - x));
	}
}
