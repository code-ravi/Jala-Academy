/*4. Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different package.*/
// Answer: PUBLIC fields and methods are accessible in same and different packages as well
package com.accessmodifiers.Test4;

public class Marks {
	public int math = 86;
	public int hindi = 74;

	public void totalMarks() {
		System.out.println("Total Marks = " + (math + hindi));
	}

}
