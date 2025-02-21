package com.project1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebDriver {
 public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demoapp.skillrary.com/");
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
