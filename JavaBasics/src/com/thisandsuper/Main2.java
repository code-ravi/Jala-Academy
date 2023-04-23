package com.thisandsuper;

public class Main2 extends Test2 {
	String name = "Udemy";

	void getName() {
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		Main2 ob = new Main2();
		ob.getName();
	}
}
