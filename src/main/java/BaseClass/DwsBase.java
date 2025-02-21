package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.fileUtility.ReadFromProperties;

public class DwsBase {
	public static WebDriver driver = null;
	@BeforeClass
	public void preCondition() throws IOException {
		String browser = ReadFromProperties.getData("browser");
    	String url = ReadFromProperties.getData("url");
    	if(browser.equalsIgnoreCase("Chrome")) {
    		driver = new ChromeDriver();
    	}else if(browser.equalsIgnoreCase("edge")) {
    		driver = new EdgeDriver();
    	}else if (browser.equalsIgnoreCase("FireFox")) {
    		driver = new FirefoxDriver();
    	}else {
    		driver = new ChromeDriver();
    	}
    	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
    
    @BeforeMethod
    public void login() throws IOException {
    	String username =  ReadFromProperties.getData("username");
    	String pass = ReadFromProperties.getData("password");
    	driver.findElement(By.className("ico-login")).click();
    	driver.findElement(By.id("Email")).sendKeys(username);
    	driver.findElement(By.id("Password")).sendKeys(pass);
    	driver.findElement(By.cssSelector("input[value='Log in']")).click();
    	System.out.println("Login is succesfull");
    }
    
    @AfterMethod
    public void logOut() {
    	driver.findElement(By.className("ico-logout")).click();
    	System.out.println("Logout Successfull");
    }
    
    @AfterClass
    public void postCondition() {
    	driver.quit();
    }
}
