//3. Read text from a .txt file using BufferedInputStream
package com.javaio;

import java.io.*;

public class Test3 {

	public static void main(String[] args) {

		try {
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\example3.txt");
			FileInputStream fileInput = new FileInputStream(file);
			BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
			byte[] contents = new byte[1024];
			int bytesRead = 0;
			String text = "";
			while ((bytesRead = bufferedInput.read(contents)) != -1) {
				text += new String(contents, 0, bytesRead);
			}
			System.out.println(text);
			bufferedInput.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
