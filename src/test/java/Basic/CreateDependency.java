package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateDependency {
     
	@Test(priority = 1,invocationCount = 2)
	public void createAccount() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.close();
		System.out.println("Create Account");
		
	}
	
	@Test(dependsOnMethods = "createAccount")
	public void updateAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chennaisuperkings.com/");
		driver.close();
		System.out.println("Update Account");
	}
	
	@Test(dependsOnMethods="createAccount")
	public void deleteAccount() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalchallengers.com/");
		driver.close();
		System.out.println("Delete Account");
	}
}
