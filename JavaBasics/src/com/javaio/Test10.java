//10. Write a program to read data from excel
package com.javaio;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test10 {

	public static void main(String[] args) {

		try {
			// Create a file object for the Excel file
			File file = new File(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\products.xlsx");

			// FileInputStream object to read the file
			FileInputStream inputStream = new FileInputStream(file);

			// Workbook object to represent the Excel file
			Workbook workbook = WorkbookFactory.create(inputStream);

			// Get the first sheet in the workbook
			Sheet sheet = workbook.getSheetAt(0);

			// Iterate over the rows in the sheet
			for (Row row : sheet) {
				// Iterate over the cells in the row
				for (Cell cell : row) {
					// Print the cell value to the console
					System.out.print(cell.toString() + "\t");
				}
				System.out.println(); // Move to the next row
			}

			
			workbook.close();
			inputStream.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
	}
}
