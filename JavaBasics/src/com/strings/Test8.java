//8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
package com.strings;

public class Test8 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "Java";
		String str3 = new String("java is the best");
		String str4 = new String("Python is dynamically typed");

		System.out.println(str1.equalsIgnoreCase(str2)); // Output: true
		System.out.println(str2.startsWith("ja")); // Output: false
		System.out.println(str3.endsWith("st")); // Output: true
		System.out.println(str4.compareTo(str3));
	}
}
