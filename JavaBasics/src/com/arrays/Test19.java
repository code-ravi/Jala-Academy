//19. Write a function to find the missing number of sorted array of 1 to 100
package com.arrays;

public class Test19 {
	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = (n * (n + 1)) / 2; // original sum of n integers
		int arrSum = 0; // new sum
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		return sum - arrSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };

		System.out.println("Missing Number is: " + findMissingNumber(arr));
	}

}
