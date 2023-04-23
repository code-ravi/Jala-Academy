//7. Read text from a .txt file using BufferedReader
package com.javaio;

import java.io.*;

public class Test7 {

	public static void main(String[] args) {

		try {
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\example7.txt");
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
