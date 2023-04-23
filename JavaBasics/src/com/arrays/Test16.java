//16. Write a function to get the difference of largest and smallest value
package com.arrays;

public class Test16 {
	private static int getDifference(int[] arr) {
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
		return largest - secLargest;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 10, 7, 9, 5, 9, 15 };

		System.out.println("Difference between largest and smallest value = " + getDifference(arr));
	}
}
