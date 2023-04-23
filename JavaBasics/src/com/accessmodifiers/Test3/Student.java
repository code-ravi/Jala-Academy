/*3. Create a class with PROTECTED fields and methods. 
Access these fields and methods from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different package
Access the PROTECTED fields and methods from any class in different package */

package com.accessmodifiers.Test3;

public class Student {
	protected int a = 65;
	protected int b = 82;

	protected void getSum() {
		System.out.println("a+b = " + (a + b));
	}

}
