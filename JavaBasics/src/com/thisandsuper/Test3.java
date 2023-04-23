//3. Call constructor of the current class using this()
package com.thisandsuper;

public class Test3 {
	private int x;
	private int y;

	public Test3() {
		this(10, 20);
		System.out.println(x);
		System.out.println(y);
	}

	public Test3(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		Test3 ob = new Test3();
	}
}
