package TestScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Login_Changepwd {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static WebDriver driver;
	public static ExtentTest test, Login_test, Ctest, Logout_test;
	String timeStamp = new SimpleDateFormat("HH.mm.ss dd/MM/yyyy").format(new Date());
	
	@BeforeSuite
	public void setup() {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(System.getProperty("user.dir") + "pp_bug_report_individual" + timeStamp +".html"); //final output file name
		reporter.config().setReportName("Login-ChangePassword-Logout Flow");
		extent.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	
	@Test
	public void config() {
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		test = extent.createTest("PP: LC Flow ");
	}
	
	@Test
	public static void login_Change_pwd() throws InterruptedException, IOException {
		
		//Login test 	
	    test.assignAuthor("Gayathri");
	    test.info("This is Login Change password and logout flow");
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
		
		//Change_pwd
		
		//Ctest = extent.createTest("PP - change password").assignAuthor("Gayathri");
		
		locatorsPP.Locators_CML a = new locatorsPP.Locators_CML(driver);
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
		}
		
		catch (Exception e) {
			File srcfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);				//Captures Screenshot
			FileUtils.copyFile(srcfile1, new File("Change_pwd.png"));
	
			test.info(MediaEntityBuilder.createScreenCaptureFromPath("Changepwd.png").build());
			test.fail("Password mismatch");
		}
		
		Thread.sleep(1000);
		test.pass("change pwd done"); 
		
		//Logout
		
		//test = extent.createTest("PP - Logout").assignAuthor("Gayathri");
		
		test.info("Logging out");

		locatorsPP.Locators_CML.click_logout_icon();
		Thread.sleep(4000);

		locatorsPP.Locators_CML.click_logout_button();
		test.pass("done!!");
	
	}
		
	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}
}
