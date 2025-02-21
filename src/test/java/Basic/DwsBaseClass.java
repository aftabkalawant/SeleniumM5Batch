package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BaseClass.DwsBase;

public class DwsBaseClass extends DwsBase {
    @Test 
	public void main() {
    	  driver.findElement(By.id("small-searchterms")).sendKeys("Welcom to the Advance");
      }
    @Test
    public void main2() throws InterruptedException {
    	String rss_url = "https:demowebshop.tricentis.com/news/rss/1";
    	List<WebElement> ecommerce = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));
    	for(WebElement web : ecommerce) {
    		String actual_url = driver.getCurrentUrl();
    		if(rss_url.equals(actual_url)) {
    			driver.navigate().back();
    		}
    		web.click();
    		Thread.sleep(1000);
    	}
    	Thread.sleep(2000);
    }
}
