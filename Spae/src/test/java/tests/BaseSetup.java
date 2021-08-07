package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSetup {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setup() {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter("reports.html"); //final output file name
		extent.attachReporter(reporter);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	
	
	@AfterSuite
	public void tearDown() {
		driver.close();
		driver.quit();
		extent.flush();
	}

}
