//1. Write a function to add integer values of an array
package com.arrays;

public class Test1 {
	public static int sum(int arr[]) {
		int result = 0;
		for (int e : arr) {
			result += e;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		System.out.println("Sum: " + sum(arr));
	}
}
