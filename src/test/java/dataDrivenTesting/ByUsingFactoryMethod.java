package dataDrivenTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.fileUtility.ReadFromProperties;

public class ByUsingFactoryMethod {
	
	@Test
        public void reaadData() throws IOException, InterruptedException {
        	String br = ReadFromProperties.getData("browser");
        	System.out.println(br);
        	Thread.sleep(2000);
        	String url = ReadFromProperties.getData("url");
        	System.out.println(url);
        	Thread.sleep(2000);
        	String user = ReadFromProperties.getData("username");
        	System.out.println(user);
        	Thread.sleep(2000);
        	String passWord = ReadFromProperties.getData("password");
        	System.out.println(passWord);
        	
        }
}
