package dataDrivenTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.utility.ReadFromExcell;

public class ReadFromFactoryMethod {
    
	@Test
	public void main() throws EncryptedDocumentException, IOException, InterruptedException {
		String data=ReadFromExcell.getData("Sheet1", 0, 0);
		String data1 = ReadFromExcell.getData("Sheet1", 0, 1);
		System.out.println(data);
		System.out.println(data1);
	
	}
}
