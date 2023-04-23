//18. Write a program to remove the duplicate elements and return the new array
// Question 12 and 18 are same
package com.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Test18 {
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
