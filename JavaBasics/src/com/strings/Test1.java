//1. Different ways creating a string
package com.strings;

public class Test1 {

	public static void main(String[] args) {
		// There are several ways to create a string in Java, few of those are:

		// 1.String Literal:
		String str1 = "Java is a programming language";
		System.out.println(str1);

		// 2.Using new keyword
		String str2 = new String("Hello World");
		System.out.println(str2);

		// 3. Using StringBuilder or StringBuffer
		StringBuilder sb = new StringBuilder();
		sb.append("Hello Java");
		String str3 = sb.toString();
		System.out.println(str3);

		// 4. Using substring() method
		String str4 = str3.substring(0, 8);
		System.out.println(str4);
	}

}
