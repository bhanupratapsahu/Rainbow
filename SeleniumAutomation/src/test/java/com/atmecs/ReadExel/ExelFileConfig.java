package com.atmecs.ReadExel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelFileConfig {
	XSSFWorkbook workbook;
	XSSFSheet sheet1;

	public ExelFileConfig(String filePath) {
		try {
			File file = new File(filePath);
			FileInputStream fileInput = new FileInputStream(file);
			try {
				workbook = new XSSFWorkbook(fileInput);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getData(String sheetName, int rowNum, int cellNum) {

		sheet1 = workbook.getSheet(sheetName);
		String data = sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	}

}
