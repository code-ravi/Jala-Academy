//9. Write a function to reverse an array of integer values
package com.arrays;

public class Test9 {
	public static int[] reverseArray(int arr[]) {
		int[] newArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[arr.length - 1 - i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int newArr[] = reverseArray(arr);

		System.out.print("Reversed Array: ");
		for (int e : newArr) {
			System.out.print(e + " ");
		}
	}
}
