package AssignmentOnExtentReport;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DwsBase;
@Listeners(com.crm.Listeners.AttachExtentReport.class)
public class TC_001 extends DwsBase {
  
	@Test
	public void searchField() throws IOException, InterruptedException {
		

		List<String> pastData = Arrays.asList("Samsung s25","Realme 6pro","Samsung s23","iphone 16");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("small-searchterms")));	
		searchField.sendKeys("Samsung s25");
		String enteredText = searchField.getAttribute("value");
		
		if(pastData.contains(enteredText)) {
			System.out.println("Validation is passed : Entered data is valid");
		}else {
			System.out.println("Validation is fail : Entered data is not valid");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
	}
}
