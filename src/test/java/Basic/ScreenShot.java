package Basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
     @Test
	public void takeScreenShot() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File path = new File(".//ScreenShot/flipkart.png");
		FileUtils.copyFile(screenShotFile, path);
		Thread.sleep(2000);
		driver.close();
	}
}
