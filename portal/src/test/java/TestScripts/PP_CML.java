

// Test Scripts for CHANGE PASSWORD, MY PROFILE, LOGOUT
package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PP_CML extends BaseSetup {

	public static WebDriver driver =null;
	public static ExtentReports extent;
	public ExtentSparkReporter spark;
	public static ExtentTest test,test2;

//	@BeforeSuite
//	public void init()
//	{
//		ExtentSparkReporter reporter = new ExtentSparkReporter("pp_report.html");
//		reporter.config().setDocumentTitle("Extent_Report_Practice");
//		reporter.config().setReportName("PP_Flow_Test");
//
//		extent = new ExtentReports();
//		extent.attachReporter(reporter);
//
//		test = extent.createTest("ppFlowTest1");
//
//	}
//
//	@BeforeTest
//	public static void setup() 
//	{
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
	@Test
	//POSITIVE FLOW SCENARIO
	public static void login() throws InterruptedException  {
		driver.get("http://15.207.2.128/authentication/login");
		test.info("Open Successfull");
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();

		driver.findElement(By.id("user-name")).sendKeys("hri774");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Admin@321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		test.pass("login done");
		change_pwd();
	}

	public static void change_pwd() throws InterruptedException {

		locatorsPP.Locators_CML a = new locatorsPP.Locators_CML(driver);
																							//Change Password
		locatorsPP.Locators_CML.click_settings_icon();
		Thread.sleep(2000);
	
		locatorsPP.Locators_CML.click_changepwd();								
		Thread.sleep(4000);
	
		test.info("Change Password Page");
		try {
			locatorsPP.Locators_CML.input_currentpwd("Admin@321");
			Thread.sleep(2000);
			locatorsPP.Locators_CML.input_pwd("Admin@123");
			Thread.sleep(2000);
			locatorsPP.Locators_CML.input_confirmpwd("Admin@321");
			Thread.sleep(2000);
			locatorsPP.Locators_CML.click_update_pwd();
			Thread.sleep(4000);
		}
		catch (Exception e) {
			test.fail("Password mismatch");
		}
		test.pass("change pwd done");   
		my_profile();
	}

	public static void my_profile() throws InterruptedException {							//My Profile
		locatorsPP.Locators_CML.click_settings_icon();
		Thread.sleep(2000);
		test.info("My Profile Page");
	 
		locatorsPP.Locators_CML.click_myprofile();
		Thread.sleep(4000);
	
		locatorsPP.Locators_CML.click_del_profilepic();
		Thread.sleep(4000);
	
		locatorsPP.Locators_CML.click_del_profilepic_button();
		Thread.sleep(4000);
		test.pass("My profile done");
		logout();
	}

	public static void logout() throws InterruptedException {									//Logout
		test.info("Logging out");
		
		locatorsPP.Locators_CML.click_logout_icon();
		Thread.sleep(4000);
		
		locatorsPP.Locators_CML.click_logout_button();
		test.pass("done!!");
	}

	@AfterTest
	public static void close() {
		driver.close();
		driver.quit();

	}

	@AfterSuite
	public static void AfterSuite() {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
