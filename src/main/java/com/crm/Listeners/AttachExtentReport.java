package com.crm.Listeners;

import java.io.File;
//import java.io.IOException;
//import java.io.IOException;
//import java.time.LocalDateTime;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClass.DwsBase;

public class AttachExtentReport extends DwsBase implements ITestListener{
	public static ExtentSparkReporter spark = null;
	public static ExtentReports report = null;
	public static ExtentTest test = null;

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
	
		test = report.createTest(name);
		test.log(Status.INFO,name +"is on Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS, name +" is pass");
	
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(':','-');
//		String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(':','-');
		String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
		test.log(Status.FAIL,name+"fail");
//		File to = new File(".\\src\\test\\resources\\ScreenShot\\"+name+time+".png");
//		try {
//		    FileHandler.copy(from, to);
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP, name+"is on test skipped");
	}

	@Override
	public void onStart(ITestContext context) {
//		File path = new File();
		//Create ExtentSparkReport
		 spark = new ExtentSparkReporter("src\\test\\resources\\Reports\\TastCase01.html");
		//Configure ExtentSparkReport
		spark.config().setDocumentTitle("DemoWebShop");
		spark.config().setReportName("Aftab");
		spark.config().setTheme(Theme.DARK);
		//Create ExtentReport
		 report = new ExtentReports();
		//provide system Information
		report.setSystemInfo("Os", "window-11");
		report.setSystemInfo("Browser", "chrome-11");
		//Attach the ExtentSparkReport to ExtentReport
		report.attachReporter(spark);
//		test.log(Status.INFO, "OnStart");
	}

	@Override
	public void onFinish(ITestContext context) {
//		Reporter.log("onFinish",true);
		report.flush();
//		test.log(Status.INFO, "is finished");
	}
}
