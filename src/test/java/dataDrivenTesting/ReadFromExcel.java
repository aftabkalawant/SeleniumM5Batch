package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadFromExcel {

	@Test
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DemoWebShopData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Thread.sleep(2000);
		
		String username1 = sheet.getRow(0).getCell(0).toString();
//		String password1 = sheet.getRow(0).getCell(1).toString();
		String user2 = sheet.getRow(1).getCell(0).toString();
	    System.out.println(username1);
		System.out.println(user2);
	}
}
