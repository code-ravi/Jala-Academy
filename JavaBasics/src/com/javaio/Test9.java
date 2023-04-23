//9. Write a program to read data from properties file.
package com.javaio;

import java.io.*;
import java.util.*;

public class Test9 {

	public static void main(String[] args) {

		try {
			Properties props = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\application.properties");
			props.load(fis);

			String username = props.getProperty("username");
			String password = props.getProperty("password");

			System.out.println("Username: " + username);
			System.out.println("Password: " + password);

			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
