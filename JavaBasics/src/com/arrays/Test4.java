//4. Write a function to test if array contains a specific value
package com.arrays;

public class Test4 {
	public static boolean isPresent(int arr[], int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int value = 65;
		System.out.println(isPresent(arr, value) ? "Found in array" : "Not found in array");
	}
}
