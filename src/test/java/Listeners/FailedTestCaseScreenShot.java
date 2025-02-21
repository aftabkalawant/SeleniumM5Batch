package Listeners;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import BaseClass.DwsBase;
@Listeners(com.crm.Listeners.FailedTestCase.class)
public class FailedTestCaseScreenShot extends DwsBase {
    
	@Test
	public void digitalDownload() throws InterruptedException {
        driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
        //click shopping cart
        driver.findElement(By.className("ico-cart")).click();
        //verify the product added successfully or not
        Thread.sleep(1000);
        try {
			 WebElement album_3rd = driver.findElement(By.xpath("//a[text()='3rd Album']"));
			 assertTrue(album_3rd.isDisplayed(),"product is not add");
			 Reporter.log("product is succefully addedd",true);
			 driver.findElement(By.name("removefromcart")).click();
			 driver.findElement(By.name("updatecart")).click();
			
		} catch (Exception e) {
			Reporter.log("product is not present",true);
			assertEquals("m","n","product is not present");
		}
	}
	
}
