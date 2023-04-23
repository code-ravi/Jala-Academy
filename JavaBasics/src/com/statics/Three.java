//3. Print static variables in Instance methods
package com.statics;

public class Three {
	static int num = 10;

	public void printNum() {
		System.out.println("num = " + num);
	}

	public static void main(String[] args) {
		Three ob = new Three();
		ob.printNum();

	}

}
