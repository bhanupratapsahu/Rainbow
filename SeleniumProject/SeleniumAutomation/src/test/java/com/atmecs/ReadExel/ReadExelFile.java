package com.atmecs.ReadExel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExelFile {
	public static void main(String[] args) {
		try {
			File file = new File(FileLocations.filePath);
			FileInputStream fileInput = new FileInputStream(file);
			XSSFWorkbook workBook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet1 = workBook.getSheet("dataSheet");

			int rowCount = sheet1.getLastRowNum();
		
			System.out.println("total rows:"+rowCount);
		    for(int i = 0; i<=rowCount;i++ ) {
		 
				String username = sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println("user name form row "+i+" is: " + username);
		    }
		    workBook.close();
		    	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}
}
