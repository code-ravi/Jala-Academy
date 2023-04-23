//3. Write a program for a Single line comment, multi-line and documentation comments

package com.javabasics;

public class Three {
	public static void main(String[] args) {
		//Single line comments starts with two forward slashes (//). Any text in front of // is not executed by Java.
		System.out.println("// This is Single line Comment.");
		System.out.println();
		
		//Multi-line comments are placed between /* and */. Any text between /* and */ is not executed by Java.
		System.out.println("/*  \r\n"
				+ "This   \r\n"
				+ "is   \r\n"
				+ "multi line   \r\n"
				+ "comment  \r\n"
				+ "*/    ");
		
		System.out.println();
		//Documentation comments are usually used to write large programs for a project or software application.

		System.out.println("/**  \r\n"
				+ "* \r\n"
				+ "*We can use various tags to depict the parameter \r\n"
				+ "*or heading or author name \r\n"
				+ "*We can also use HTML tags   \r\n"
				+ "* \r\n"
				+ "*/    ");
	}
	
}
