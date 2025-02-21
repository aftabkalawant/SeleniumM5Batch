package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsLogin;

public class Login {

	@Test
	public void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		DwsLogin dws = new DwsLogin(driver);
		Thread.sleep(1000);
		dws.loginLink();
		Thread.sleep(1000);
		dws.userName("admin01@gmail.com");
		Thread.sleep(1000);	
		dws.password("admin01");
		Thread.sleep(1000);
		dws.rememberMe();
		Thread.sleep(1000);
		dws.loginButton();
	}
}
