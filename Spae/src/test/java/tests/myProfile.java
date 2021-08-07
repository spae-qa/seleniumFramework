//pplogin page test

package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import pages.ppLogin;

public class myProfile extends BaseSetup {
	@Test 
	public void logintest() throws InterruptedException  {
		ExtentTest test = extent.createTest("MyProfile");
		test.assignAuthor("Junior Lead");
		 test.info("chrome driver opened successfully");
	
		
		ppLogin loginFlow = new ppLogin(driver);
		
		driver.get("http://15.207.2.128/authentication/login");
		test.info("URL loaded successfully");
		Thread.sleep(5000);
		loginFlow.username("hri774"); 
		loginFlow.password("Admin@321");
		loginFlow.login();
		Thread.sleep(1000);
		test.info("Login success for Hrithik user");
		test.pass("login success");
		
		loginFlow.settings_click();
		test.info("Logout success for Hrithik user");
		test.pass("logout success");
		Thread.sleep(1000);
		
		loginFlow.myprofileopt();
		test.info("clicked on my profile in settings drop-down");
		test.pass("logout success");
		Thread.sleep(1000);
		
		loginFlow.picdelete();
		test.info("clicked onpic delete icon");
		test.pass("pop-up opened successfully success");
		Thread.sleep(1000);
		
		loginFlow.deleteeprofilepic();
		test.info("profile pic deleted successfully");
		test.pass("deleted succssfully");
	}

}



