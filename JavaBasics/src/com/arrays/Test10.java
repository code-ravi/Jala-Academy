//10. Write a function to find the duplicate values of an array
package com.arrays;

import java.util.Arrays;

public class Test10 {
	public static int[] findDuplicates(int[] arr) {
		int[] duplicates = new int[arr.length];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					boolean isDuplicate = false;
					for (int k = 0; k < count; k++) {
						if (duplicates[k] == arr[i]) {
							isDuplicate = true;
							break;
						}
					}
					if (!isDuplicate) {
						duplicates[count++] = arr[i];
					}
					break;
				}
			}
		}
		return Arrays.copyOf(duplicates, count);
	}

	public static void main(String[] args) {
		int arr[] = { 13, 15, 13, 25, 15, 11, 36, 34, 25, 11 };
		int duplicates[] = findDuplicates(arr);

		
		System.out.print("Duplicate Values: ");
		for (int e : duplicates) {
			System.out.print(e + " ");
		}
	}
}
