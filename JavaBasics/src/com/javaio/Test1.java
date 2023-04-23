//1. Write a program to read text from .txt file using InputStream
package com.javaio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {
	public static void main(String[] args) {
		try {

			InputStream input = new FileInputStream(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\example1.txt");

			// Read the contents of the file into a byte array
			byte[] buffer = new byte[1024];
			int bytesRead = input.read(buffer);

			// Convert the byte array to a string and print it
			String fileContents = new String(buffer, 0, bytesRead);
			System.out.println(fileContents);

			input.close();
		} catch (IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}

	}

}
