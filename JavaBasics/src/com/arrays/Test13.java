//13. Write a method to find the second largest number in an array
package com.arrays;

public class Test13 {
	private static int findSecondLargestNumber(int[] arr) {
		int largest = arr[0];
		int secLargest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];

			} else if (arr[i] < largest && arr[i] > secLargest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 10, 7, 9, 5, 9, 10 };

		System.out.println("Second Largest Element is: " + findSecondLargestNumber(arr));
	}
}
