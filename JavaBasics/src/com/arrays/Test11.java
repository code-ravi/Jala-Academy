//11. Write a program to find the common values between two arrays
package com.arrays;

public class Test11 {
	public static int[] commonValues(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					newArr[i] = arr1[i];
				}
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 5, 6, 7, 9 };
		int[] arr2 = { 1, 4, 6, 8, 0, 3 };
		int[] newArr = commonValues(arr1, arr2);

		System.out.println("Common Elements: ");
		for (int e : newArr) {
			if (e != 0) {
				System.out.println(e);
			}
		}
	}
}
