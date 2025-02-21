package dataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadFromXml {
	@Parameters({"url","username","pass"})
	@Test
   public void main(String url,String user , String pass) throws InterruptedException {
		System.out.println(user);
		System.out.println(pass);
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   driver.get(url);
	   Thread.sleep(2000);
	   driver.findElement(By.className("ico-login")).click();
	   driver.findElement(By.id("Email")).sendKeys(user);
	   driver.findElement(By.id("Password")).sendKeys(pass);
	   Thread.sleep(2000);
	   driver.findElement(By.cssSelector(".button-1.login-button")).click();
	   Thread.sleep(2000);
	   driver.quit();
	  
	   
	   
   }
}
