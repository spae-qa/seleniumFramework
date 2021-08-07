//pplogin page test

package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import pages.ppLogin;

public class contactUsTest extends BaseSetup {
	@Test 
	public void logintest() throws InterruptedException  {
		ExtentTest test = extent.createTest("contactUS");
		test.assignAuthor("Junior Lead");
		 test.info("chrome driver opened successfully");
	
		
		ppLogin contatcus = new ppLogin(driver);
		
		driver.get("http://15.207.2.128/authentication/login");
		test.info("URL loaded successfully");
		Thread.sleep(5000);

		contatcus.username("hri774"); 
		contatcus.password("Admin@321");
		contatcus.login();
		Thread.sleep(3000);
		test.info("Login success for Hrithik user");
		test.pass("login success");
		
		contatcus.contactus();
		test.info("contactUS page is opened here");
		test.pass("contact us success");
		Thread.sleep(2000);
		
		contatcus.cont_dropdowntap();
		test.info("tapped on please select");
		test.pass("tapping success");
		
		contatcus.appointments();
		test.info("tapped and selectes appointments in drop-down");
		test.pass("appoitments option selection success");
	
		contatcus.subject("Hello this is sample testing for selenium");
		test.info("subject message");
		test.pass("subject passes");
	
		contatcus.message("Hello this is sample messahe for selenium");
		test.info("subject message");
		test.pass("subject passes");
		
		contatcus.send();
		test.info("message sent successfully");
		test.pass("sent conatct us form");

		
		
	}

}



