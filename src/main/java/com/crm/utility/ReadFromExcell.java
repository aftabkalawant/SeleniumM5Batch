package com.crm.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcell {

	
	public static String getData(String sh , int row , int col) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DemoWebShopData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sh);
		Thread.sleep(2000);
		String data = sheet.getRow(row).getCell(col).toString();
		return data;
	}
}
