package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrioriitizationExam {

	@Test(priority = 1, invocationCount = 2,threadPoolSize=2)
	public void dws() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
	}

	@Test(priority = 2)
	public void csk() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		driver.close();
	}

	@Test(priority = 0)
	public void rcb() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		driver.close();

	}
}
