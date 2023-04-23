//7. Comparing strings using the methods equals(),
package com.strings;

public class Test7 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");

		System.out.println(str1.equals(str2)); // Output: true
		System.out.println(str1.equals(str3)); // Output: true
		System.out.println(str1.equals("javac")); //Output: false
	}
}
