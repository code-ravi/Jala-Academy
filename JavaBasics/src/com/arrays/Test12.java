//12. Write a method to remove duplicate elements from an array
package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Test12 {
	public static int[] removeDuplicates(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		int[] result = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 7, 9, 5, 3, 10 };

		int[] newArr = removeDuplicates(arr);

		System.out.println("Array without duplicates: " + Arrays.toString(newArr));
	}
}
