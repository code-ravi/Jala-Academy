package com.constructors;

public class Main2 extends Test2 {
	Main2() {
		super();
	}

	Main2(int a) {
		super(a);
	}

	public static void main(String[] args) {
		Main2 ob = new Main2();
		ob = new Main2(10);
	}

}
