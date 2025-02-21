package dataDrivenTesting;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.utility.DemoWebShopBaseClass;

public class DWSExample {
    
	@Test
	public void login() throws InterruptedException, IOException {
//		DemoWebShopBaseClass.enterIntoDWS();
		DemoWebShopBaseClass.login();
		
	}
}
