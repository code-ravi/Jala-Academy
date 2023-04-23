package com.thisandsuper;

public class MainForTest5 extends Test5 {
	public MainForTest5() {
		super();
		System.out.println("This is Child Constructor");
	}

	public static void main(String[] args) {
		MainForTest5 ob = new MainForTest5();
	}

}
