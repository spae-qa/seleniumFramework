//pp side menu test upto my workout genes

package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pages.ppLogin;

public class PPsideMenu extends BaseSetup {
	@Test 
	public void logintest() throws InterruptedException, IOException  {
		ExtentTest test = extent.createTest("ppSideMenuFlowTest");
		test.assignAuthor("Junior Lead");
		 test.info("chrome driver opened successfully");
	
		
		ppLogin sidemenu = new ppLogin(driver);
		
		driver.get("http://15.207.2.128/authentication/login");
		test.info("URL loaded successfully");
		
		sidemenu.username("hri774"); 
		sidemenu.password("Admin@321");
		sidemenu.login();
		Thread.sleep(1000);
		test.info("Login success for Hrithik user");
		test.pass("login success");
		
		sidemenu.myhelprb();
		Thread.sleep(5000);
		test.info("This is My Health problems report");
		test.pass("health prblm pass");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File( "aa.png"));		
		test.log(Status.INFO, "my health prblms").addScreenCaptureFromPath("aa.png");
		
		
		
		sidemenu.mythree();
		Thread.sleep(1000);
		test.info("This is My 3 Month Action Plan report");
		test.pass("3 month  pass");
		
		sidemenu.reports();
		Thread.sleep(1000);
		test.info("These are all old reports of a patient");
		test.pass("old reports  pass");
		
		sidemenu.condimprone();
		Thread.sleep(1000);
		test.info("This is Disease cnditions i'm prone to Diseases report");
		test.pass("diseases  pass");
		
		sidemenu.cancer();
		Thread.sleep(1000);
		test.info("This is Disease cnditions i'm prone to cancers report");
		test.pass("cancer  pass");
		
		sidemenu.myimmunity();
		Thread.sleep(1000);
		test.info("This is MyImmunity report");
		test.pass("MyImmunity  pass");
		
		sidemenu.mydietarrysupp();
		Thread.sleep(1000);
		test.info("This is My dietary supplements report");
		test.pass("MyDietary  pass");
		
		sidemenu.myfoodrecom();
		Thread.sleep(1000);
		test.info("This is My food recommendations report");
		test.pass("Myfood rec  pass");
		
		
		sidemenu.sevenday();
		Thread.sleep(1000);
		test.info("This is Seven day diet plan report");
		test.pass(" seven day  pass");
		
		sidemenu.mymediactionlist();
		Thread.sleep(1000);
		test.info("This is My medication report");
		test.pass(" my medication  pass");
		
		sidemenu.myworkoutrec();
		Thread.sleep(1000);
		test.info("This is My workout recommendations report");
		test.pass(" my workout rec  pass");
		
		sidemenu.myfoodgenes();
		Thread.sleep(1000);
		test.info("This is My food genes report");
		test.pass(" my food genes  pass");
		
		sidemenu.myworkoutgenes();
		Thread.sleep(1000);
		test.info("This is My workout genes report");
		test.pass(" my workout genes  pass");
		
		sidemenu.contactus();
		Thread.sleep(6000);
		test.info("This is contact us");
		test.pass(" contact us  pass");
		
		
	}

}



