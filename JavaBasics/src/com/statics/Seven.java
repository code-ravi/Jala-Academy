//7. Call static methods and instance methods in main method
package com.statics;

public class Seven {

	public static void printMessage() {
		System.out.println("Hello World: This is from static method");
	}

	public void greeting() {
		System.out.println("Namaskaram, this is from instance method");
	}

	public static void main(String[] args) {
		Seven ob = new Seven();
		// calling static method
		printMessage();
		// calling instance method
		ob.greeting();
	}

}
