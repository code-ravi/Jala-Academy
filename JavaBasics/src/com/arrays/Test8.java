//8. Write a function to find the minimum and maximum value of an array
package com.arrays;

public class Test8 {
	public static void findMinAndMax(int arr[]) {
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < minVal) {
				minVal = arr[i];
			} else if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		System.out.println("Minimum Value: " + minVal);
		System.out.println("Maximum Value: " + maxVal);
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		findMinAndMax(arr);
	}
}
