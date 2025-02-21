package ExtentReportMethod;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class SampleReport {
   
	@Test
	public void report() {
		
		File path = new File(".\\src\\test\\resources\\Reports\\sampleReport.html");
		//Create ExtentSparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		//Configure ExtentSparkReport
		spark.config().setDocumentTitle("DemoWebShop");
		spark.config().setReportName("Aftab");
		spark.config().setTheme(Theme.DARK);
		//Create ExtentReport
		ExtentReports report = new ExtentReports();
		//provide system Information
		report.setSystemInfo("Os", "window-11");
		report.setSystemInfo("Browser", "chrome-111");
		//Attach the ExtentSparkReport to ExtentReport
		report.attachReporter(spark);
		//create extentTest
//		ExtentTest test = report.createTest("reports");
		//use flush
		report.flush();
	}
}
