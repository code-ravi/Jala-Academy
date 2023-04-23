//4. Write constructors with return type int and String
/*Answer: In Java, constructors do not have a return type. The purpose of a constructor is to initialize 
an object of a class, and it always returns the instance of the class that it creates. */
package com.constructors;

public class Test4 {
	int Test4() {
		System.out.println("Constructor with return type int");
	}

	String Test4(int a) {
		System.out.println("Constructor with return type String");
	}

	public static void main(String[] args) {
		Test4 ob = new Test4();
	}

}
