//6. Write a program to write text to .txt file using FileWriter
package com.javaio;

import java.io.*;

public class Test6 {

	public static void main(String[] args) {

		try {
			String text = "Hello, world from Test6";
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\output6.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(text);
			fileWriter.flush();
			fileWriter.close();
			System.out.println("Text written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
