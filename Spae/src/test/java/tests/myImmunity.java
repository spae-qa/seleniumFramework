//pplogin page test

package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import logPack.log4j;
import pages.ppLogin;

public class myImmunity extends BaseSetup {
	private static Logger logger = LogManager.getLogger(log4j.class); // to create logs
	@Test 
	public void logintest() throws InterruptedException, IOException  {

		ExtentTest test = extent.createTest("MyimmunityTest");  //creating test name
		test.assignAuthor("Junior Lead");


		driver.get("http://15.207.2.128/authentication/login");		

		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File( "a.png"));		
		test.log(Status.INFO, "myImmunity").addScreenCaptureFromPath("a.png");

		test.info("chrome driver opened successfully");


		ppLogin loginFlow = new ppLogin(driver);

		test.info("URL loaded successfully");
		Thread.sleep(4000);

		loginFlow.username("hri774"); 
		loginFlow.password("Admin@321");
		loginFlow.login();
		Thread.sleep(4000);

		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(srcFile2, new File( "b.png"));
		test.log(Status.WARNING, MediaEntityBuilder.createScreenCaptureFromPath("b.png").build());

		test.info("Login success for Hrithik user");
		test.pass("login success");
		loginFlow.myimmunity();
		Thread.sleep(3000);

		File srcFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(srcFile3, new File( "c.png"));
		test.log(Status.WARNING, MediaEntityBuilder.createScreenCaptureFromPath("c.png").build());
		
		extent.setSystemInfo("Operatig system", System.getProperty("os.name"));
		extent.setSystemInfo("OS version", System.getProperty("os.version"));
		extent.setSystemInfo("OS Arch Model", System.getProperty("os.arch"));
		extent.setSystemInfo("Java Version", System.getProperty("java.runtime.version"));
		extent.setSystemInfo("User", System.getProperty("user.name"));
		extent.setSystemInfo("Author","Test Engineer Spae");
		extent.setSystemInfo("Email", "spae.automation@gmail.com");
		
		logger.info("This is info message for immunity");


		

	}



}



