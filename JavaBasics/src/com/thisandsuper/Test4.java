//4. Call argument constructor of current class using this()
package com.thisandsuper;

public class Test4 {
	int a;
	int b;

	Test4() {
		this(4, 6);
	}

	Test4(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void getSum() {
		System.out.println("a+b = " + (a + b));
	}

	public static void main(String[] args) {
		Test4 ob = new Test4();
		ob.getSum();
	}
}
