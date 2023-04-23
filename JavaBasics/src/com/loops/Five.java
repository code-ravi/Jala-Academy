//5. Write a program to print largest number among three numbers.
package com.loops;

public class Five {

	public static void main(String[] args) {
		int a=5; 
		int b= 25;
		int c=15;
		
		if(a>=b && a>=c) {
			System.out.println("a is largest");
		}else if(b>=a && b>=c) {
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest");
		}

	}

}
