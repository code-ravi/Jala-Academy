//17. Write a method to verify if the array contains two specified elements(12,23)
package com.arrays;

public class Test17 {
	private static boolean doesContains(int[] arr, int[] elements) {
		boolean elementAt0 = false;
		boolean elementAt1 = false;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == elements[0]) {
				elementAt0 = true;
			} else if (arr[i] == elements[1]) {
				elementAt1 = true;
			}
			if (elementAt0 && elementAt1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 12, 7, 9, 5, 23, 15 };
		int[] elements = { 12, 23 };

		System.out.println(doesContains(arr, elements));
	}
}
