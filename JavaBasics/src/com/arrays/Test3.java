//3. Write a program to find the index of an array element
package com.arrays;

public class Test3 {
	public static int findIndexOf(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int key = 47;
		System.out.println("Index of " + key + " is: " + findIndexOf(arr, key));
	}
}
