//6. Write a function to copy an array to another array
package com.arrays;

public class Test6 {
	public static int[] copyArray(int arr[]) {
		int[] newArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		int[] newArr = copyArray(arr);

		System.out.print("Copied Array: ");
		for (int e : newArr) {
			System.out.print(e + " ");
		}
	}
}
