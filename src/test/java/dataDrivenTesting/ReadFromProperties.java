package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadFromProperties {
  
	@Test
	public void data() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream(".\\src\\test\\resources\\DemoLogin.properties");
		prop.load(file);
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String userName = prop.getProperty("username");
		String pass = prop.getProperty("password");
		Thread.sleep(1000);
		System.out.println(browser);
		Thread.sleep(1000);
		System.out.println(url);
		Thread.sleep(1000);
		System.out.println(userName);
		Thread.sleep(1000);
		System.out.println(pass);
		Thread.sleep(1000);
	}
}
