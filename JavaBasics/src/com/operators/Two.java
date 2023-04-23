//2. Write a method for increment and decrement operators(++, --)
package com.operators;

public class Two {
	public static void increDecreOperator(int x) {
		System.out.println(x++); // prints 10
		System.out.println(x);   // prints 11
		System.out.println(++x); // prints 12
		System.out.println(x);   // prints 12
		System.out.println(x--); // prints 12
		System.out.println(x);   // prints 11
		System.out.println(--x); // prints 10
		System.out.println(x);   // prints 10
	}
	public static void main(String[] args) {
		increDecreOperator(10);
		
	}

}
