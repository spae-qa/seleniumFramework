//pplogin page test

package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import pages.ppLogin;

public class ppLoginTest extends BaseSetup {
	@Test 
	public void logintest() throws InterruptedException  {
		ExtentTest test = extent.createTest("ppLoginTest");
		test.assignAuthor("Junior Lead");
		 test.info("chrome driver opened successfully");
	
		
		ppLogin loginFlow = new ppLogin(driver);
		
		driver.get("http://15.207.2.128/authentication/login");
		test.info("URL loaded successfully");
		
		loginFlow.username("hri774"); 
		loginFlow.password("Admin@321");
		loginFlow.login();
		Thread.sleep(1000);
		test.info("Login success for Hrithik user");
		test.pass("login success");
		
				
	}

}



