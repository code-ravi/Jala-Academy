//5. Write a program to read text from .txt file using FileReader
package com.javaio;

import java.io.*;

public class Test5 {

	public static void main(String[] args) {

		try {
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\example5.txt");
			FileReader fileReader = new FileReader(file);
			int character;
			String text = "";
			while ((character = fileReader.read()) != -1) {
				text += (char) character;
			}
			System.out.println(text);
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
