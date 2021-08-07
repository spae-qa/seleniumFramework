//pplogin page test

package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import pages.ppLogin;

public class changePassword extends BaseSetup {
	@Test 
	public void logintest() throws InterruptedException  {
		ExtentTest test = extent.createTest("change password Test");
		test.assignAuthor("Junior tester");
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
		loginFlow.settings_click();
		//loginFlow.logout();
		loginFlow.changepasswordopt();
		test.info("change password clicked");
		test.pass("click on change password success");
		Thread.sleep(1000);

		
		loginFlow.oldpassword("Admin@123");
		test.info("Entered old password");
		test.pass("old password is entered");
		Thread.sleep(1000);

		
		loginFlow.newpassword("Admin@321");
		test.info("Entered new password");
		test.pass("New password is entered");		
		Thread.sleep(1000);

		loginFlow.confirmpwd("Admin@321");
		test.info("Entered confirm password");
		test.pass("confirm pwd is entered");
		Thread.sleep(1000);

		loginFlow.updatepwdclick();
		test.info("clicked on updated password button");
		test.pass("password updated succesfully");
	}

}



