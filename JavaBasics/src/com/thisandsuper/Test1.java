//1. Print the fields/instance members of the current class using this and without using object
package com.thisandsuper;

public class Test1 {
	int x = 15;

	void print() {
		System.out.println(this.x); // printing this without using object
	}

	public static void main(String[] args) {
		Test1 ob = new Test1();
		ob.print();
	}

}
