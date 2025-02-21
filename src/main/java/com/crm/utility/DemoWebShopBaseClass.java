package com.crm.utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.fileUtility.ReadFromProperties;

public class DemoWebShopBaseClass {
    
	public static void enterIntoDWS() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 String url = ReadFromProperties.getData("url");
		driver.get(url);
	
	}
	
	public static void login() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 String url = ReadFromProperties.getData("url");
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	}
	
	public static void resister() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
	}
}
