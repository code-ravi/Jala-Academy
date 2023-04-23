//1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
package com.statics;

public class One {
	static int id = 108;
	static String name = "Jala";
	int totalMarks = 468;
	float avgMarks = 93.6f;

	public static void printId() {
		System.out.println(id);
	}

	public static void printName() {
		System.out.println(name);
	}

	public void printTotalMarks() {
		System.out.println(totalMarks);
	}

	public void printAverageMarks() {
		System.out.println(avgMarks);
	}

	public static void main(String[] args) {
		One obj = new One();
		printId();
		printName();
		obj.printAverageMarks();
		obj.printTotalMarks();

	}

}
