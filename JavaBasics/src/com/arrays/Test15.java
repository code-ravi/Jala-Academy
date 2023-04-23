//15. Write a method to find number of even number and odd numbers in an array
package com.arrays;

public class Test15 {
	private static void findNumberOfEvenOdd(int[] arr) {
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of Even Elements= " + evenCount);
		System.out.println("Number of Odd Elements= " + oddCount);
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 10, 7, 9, 5, 9, 10 };

		findNumberOfEvenOdd(arr);
	}
}
