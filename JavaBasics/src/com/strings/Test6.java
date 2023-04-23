//6. Matching a String Against a Regular Expression With matches()
package com.strings;

public class Test6 {

	public static void main(String[] args) {
		String pattern = ".*java.*"; // A Regular Expression
		String str1 = "I like java language";
		String str2 = "I love to code with python";

		boolean match1 = str1.matches(pattern);
		boolean match2 = str2.matches(pattern);

		System.out.println("Match 1: " + match1); // Output: Match 1: true
		System.out.println("Match 2: " + match2); // Output: Match 2: false

	}
}
