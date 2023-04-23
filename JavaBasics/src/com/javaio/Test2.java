//2. Write a program to write text to .txt file using OutputStream
package com.javaio;

import java.io.*;

public class Test2 {

	public static void main(String[] args) {

		try {

			OutputStream output = new FileOutputStream(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\output2.txt");

			// Write the text to the file
			String text = "Hello, world!";
			byte[] bytes = text.getBytes();
			output.write(bytes);

			output.close();

			System.out.println("Text written to file successfully.");
		} catch (IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
