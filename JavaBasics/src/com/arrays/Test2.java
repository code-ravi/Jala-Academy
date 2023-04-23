//2. Write a function to calculate the average value of an array of integers
package com.arrays;

public class Test2 {
	public static double average(int arr[]) {
		int result = 0;
		for (int e : arr) {
			result += e;
		}
		return (double)result / arr.length;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 3, 8, 15, 65, 25, 47, 11, 36 };
		System.out.println("Average: " + average(arr));
	}
}
