//12. Write a program to generate IOException
package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test12 {

	public static void main(String[] args) {

		try {
			// Attempt to read from a file
			BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
