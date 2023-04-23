//11.Write a program to generate FileNotFoundException
package com.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		try {
			// Attempt to read from a non-existent file
			File file = new File("nonexistentfile.txt");
			Scanner scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
