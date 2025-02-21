package ExtentReportMethod;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClass.DwsBase;
@Listeners(com.crm.Listeners.AttachExtentReport.class)
public class MultipleTestCases extends DwsBase {
	@Test
	public void main1() {
		Reporter.log("Main1",true);
	}
	@Test(timeOut = 1000)
	public void main2() throws InterruptedException {
		Reporter.log("Main2" , true);
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = "main2")
	public void main3() {
		Reporter.log("Main3",true);
	}
    
}
