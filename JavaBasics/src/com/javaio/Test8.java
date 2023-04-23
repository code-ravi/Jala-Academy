//8. Write text to a .txt file using BufferedWriter
package com.javaio;

import java.io.*;

public class Test8 {

	public static void main(String[] args) {

		try {
			String text = "Hello, world from Test8";
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\output8.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
			bufferedWriter.write(text);
			bufferedWriter.newLine(); // Add a new line after the text
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("Text written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
