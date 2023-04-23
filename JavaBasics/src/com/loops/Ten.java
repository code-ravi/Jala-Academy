//10. Write a program to palindrome or not.
package com.loops;

public class Ten {
	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("malayalam"));

	}

}
