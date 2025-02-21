package AssignmentOnExtentReport;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DwsBase;
@Listeners(com.crm.Listeners.AttachExtentReport.class)
public class TC_003 extends DwsBase{
 
	@Test
	public void communityPoll() throws IOException, InterruptedException {

		List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
		
		for(WebElement radio : radioButtons) {
			if(!radio.isSelected()) {
				radio.click();
				 System.out.println("Clicked: " + radio.getAttribute("outerHTML"));
				 Thread.sleep(1000);
			}
		}
		

	}
}
	
