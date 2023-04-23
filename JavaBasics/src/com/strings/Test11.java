//11. Splitting strings with split()
package com.strings;

public class Test11 {

	public static void main(String[] args) {
		String string = "apple,banana,orange,grapes,papaya";
		String[] fruits = string.split(",");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
