// Part of Ques 3: Access these fields and methods from any other class in the same package.
package com.accessmodifiers.Test3;

public class Main {
	public static void main(String[] args) {
		Student ob = new Student();
		System.out.println("a= " + ob.a);
		System.out.println("b= " + ob.b);
		ob.getSum();
	}
}
