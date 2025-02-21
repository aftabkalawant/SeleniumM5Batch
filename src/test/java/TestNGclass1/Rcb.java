package TestNGclass1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rcb {
	@Test(groups = "regration")
	 public void rcb() throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 //maximize the browser
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 //Enter into rcb
		 driver.get("https://www.royalchallengers.com/");
		 driver.quit();
	 }
}
