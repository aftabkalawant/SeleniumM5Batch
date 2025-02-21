package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DynamicReadExcel {
 
	@Test
	public void dynamic() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DemoWebShopData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Thread.sleep(2000);
		
		int row=sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println(row+" "+col);
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				String data = sheet.getRow(i).getCell(j).toString();
				System.out.println(data);
				Thread.sleep(2000);
			}
		}
	}
}
