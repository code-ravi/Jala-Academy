//4. Write text to a .txt file using BufferedOutputStream
package com.javaio;

import java.io.*;

public class Test4 {

	public static void main(String[] args) {

		try {
			String text = "Hello, world from Test4";
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\example4.txt");

			FileOutputStream fileOutput = new FileOutputStream(file);
			BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

			byte[] contents = text.getBytes();
			bufferedOutput.write(contents);

			bufferedOutput.flush();
			bufferedOutput.close();
			System.out.println("Text written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
