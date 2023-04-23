//7. Write a function to insert an element at a specific position in the array
package com.arrays;

public class Test7 {
	public static int[] insertElementAtIndex(int arr[], int newElement, int index) {
		int[] newArr = new int[arr.length + 1];
		int j = 0; // iterator for old array

		for (int i = 0; i < newArr.length; i++) {
			if (i == index) {
				newArr[i] = newElement;
			} else {
				newArr[i] = arr[j];
				j++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int newElement = 26;
		int index = 5;

		int[] newArr = insertElementAtIndex(arr, newElement, index);

		System.out.print("Updated Array: ");
		for (int e : newArr) {
			System.out.print(e + " ");
		}
	}
}
