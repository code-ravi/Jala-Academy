//5. Write a function to remove a specific element from an array
package com.arrays;

public class Test5 {
	public static int[] removeElement(int arr[], int element) {
		int[] newArr = new int[arr.length - 1];
		int j = 0; // iterator for new array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != element) {
				newArr[j] = arr[i];
				j++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int element = 15; // element that needs to be removed
		int[] newArr = removeElement(arr, element);

		for (int e : newArr) {
			System.out.print(e + " ");
		}
	}
}
