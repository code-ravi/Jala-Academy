package com.thisandsuper;

public class ChildForTest6 extends Test6 {
	int id = 302;
	String name = "Udemy";

	void print() {
		System.out.println("Parent's id: " + super.id);
		System.out.println("Parent's name: " + super.name);
		System.out.println("Child's id: " + this.id);
		System.out.println("Child's name: " + this.name);
	}

	public static void main(String[] args) {
		ChildForTest6 ob = new ChildForTest6();
		ob.print();
	}

}
