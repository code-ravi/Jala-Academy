//3. Write a method which throws exception, Call that method in main class without try block
package com.exceptions;

public class Test3 {
	public static void findElement() throws ArrayIndexOutOfBoundsException {
		int arr[] = { 5, 3, 8, 6, 9 };
		arr[6] = 10;
		System.out.println(arr[6]);
	}

	public static void main(String[] args) {
		findElement(); // This line will throw an ArrayIndexOutOfBoundsException
	}
}
