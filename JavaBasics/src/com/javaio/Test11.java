//11. Write a program to write data to excel
package com.javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test11 {

	public static void main(String[] args) {

		try {
			// Create a new Workbook object
			Workbook workbook = new XSSFWorkbook();

			// Create a new Sheet object
			Sheet sheet = workbook.createSheet("Sheet1");

			// Create a new Row object
			Row row = sheet.createRow(0);

			// Create a new Cell object and set its value
			Cell cell = row.createCell(0);
			cell.setCellValue("Hello, world from Test11");

			// Create a new file output stream
			FileOutputStream outputStream = new FileOutputStream(
					"C:\\Users\\Ravi Ranjan\\Desktop\\JalaAcademy\\Java Answers\\JavaBasics\\src\\com\\javaio\\output11.xlsx");

			// Write the workbook data to the output stream
			workbook.write(outputStream);
			System.out.println("Data entered in Excel sheet");

			outputStream.close();
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
