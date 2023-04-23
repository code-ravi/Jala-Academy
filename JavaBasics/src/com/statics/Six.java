//6. Print all the static, instance variables in main method
package com.statics;

public class Six {
	static int id = 108;
	String name ="Jala Academy";

	public static void main(String[] args) {
		Six ob = new Six();
		System.out.println(id);
		System.out.println(ob.name);

	}

}
