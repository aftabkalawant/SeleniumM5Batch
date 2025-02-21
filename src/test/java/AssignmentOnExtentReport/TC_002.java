package AssignmentOnExtentReport;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseClass.DwsBase;

public class TC_002 extends DwsBase{

	@Test
	public void giftCard() throws IOException, InterruptedException {
		preCondition();
		login();
		driver.findElement(By.linkText("Gift Cards")).click();
		Thread.sleep(2000);
//		driver.findElement(null)
//		driver.navigate().back();
	}
}
