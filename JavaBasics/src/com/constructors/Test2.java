//2. Call the constructors(both default and argument constructors) of super class from a child class
package com.constructors;

public class Test2 {
	Test2() {
		System.out.println("This is default constructor of Super class");
	}

	Test2(int a) {
		System.out.println("This is parameterised constructor of Super class, a= "+a);
	}
}
