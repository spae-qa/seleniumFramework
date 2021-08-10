
// Test Scripts for E2E Flow of PP

package locatorsPP;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PP_All_Functions {

	public static WebDriver driver = null;
	public static ExtentReports extent;
	public ExtentSparkReporter spark;
	public static ExtentTest test;

	@BeforeSuite
	public void init()
	{
		ExtentSparkReporter reporter = new ExtentSparkReporter("pp_report.html");
		reporter.config().setDocumentTitle("Extent_Report_Practice");
		reporter.config().setReportName("PP_Flow_Test");

		extent = new ExtentReports();
		extent.attachReporter(reporter);

		test = extent.createTest("pp-E2E-FlowTest1");
	}

	@BeforeTest
	public static void setup() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	//POSITIVE FLOW SCENARIO
	public static void login() throws InterruptedException, IOException {
		driver.get("http://15.207.2.128/authentication/login");
		test.info("Open Successfull");
		locatorsPP.Locators_CML a = new locatorsPP.Locators_CML(driver);
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).clear();

		driver.findElement(By.id("user-name")).sendKeys("hri774");
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Admin@321");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		test.pass("login done");
		my_current_health_problems();
	}

	public static void my_current_health_problems() throws InterruptedException, IOException {
		Locators_CML.click_mycurrent_health_problems();
		Thread.sleep(3000);
		test.info("This is My Health problems report");
		test.pass("My current Health prolems");
		my_3month_action_plan();
	}

	public static void my_3month_action_plan() throws InterruptedException, IOException {
		Locators_CML.click_my3month_action_plan();
		Thread.sleep(3000);
		test.info("This is My 3 Month Action Plan report");
		test.pass("My 3 month action plan");
		reports();
	}

	public static void reports()throws InterruptedException, IOException {
		Locators_CML.click_reports();
		Thread.sleep(3000);
		test.info("These are all old reports of a patient");
		test.pass("All reports section");
		disease_conditions_improne_to();
	}

	public static void disease_conditions_improne_to()throws InterruptedException, IOException {
		Locators_CML.click_disease_conditions_improne_to();
		Thread.sleep(3000);
		test.info("This is Disease cnditions i'm prone to Diseases report");
		test.pass("Disease conditions I'm prone to");
		cancer();
	}

	public static void cancer()throws InterruptedException, IOException {
		Locators_CML.click_cancer();
		Thread.sleep(3000);
		test.info("This is Disease cnditions i'm prone to cancers report");
		test.pass("cancer");
		my_immunity();
	}

	public static void my_immunity()throws InterruptedException, IOException {
		Locators_CML.click_myimmunity();
		Thread.sleep(3000);
		test.info("This is MyImmunity report");
		test.pass("MyImmunity  pass");
		my_dietary_supplemts();
	}

	public static void my_dietary_supplemts()throws InterruptedException, IOException {
		Locators_CML.click_mydietary_supplements();
		Thread.sleep(3000);
		test.info("This is My dietary supplements report");
		test.pass("MyDietary  pass");
		my_food_recommendations();
	}

	public static void my_food_recommendations()throws InterruptedException, IOException {
		Locators_CML.click_myfood_recommendations();
		Thread.sleep(3000);
		test.info("This is My food recommendations report");
		test.pass("Myfood rec  pass");
		my_7day_diet_plan();
	}

	public static void my_7day_diet_plan()throws InterruptedException, IOException {
		Locators_CML.click_7day_dietplan();
		Thread.sleep(3000);
		test.info("This is Seven day diet plan report");
		test.pass(" seven day  pass");
		my_medication_list();
	}

	public static void my_medication_list() throws InterruptedException, IOException{
		Locators_CML.click_mymediaction_list();
		Thread.sleep(3000);
		test.info("This is My medication report");
		test.pass(" my medication  pass");
		my_workout_recommendations();
	}

	public static void my_workout_recommendations()throws InterruptedException, IOException {
		Locators_CML.click_myworkout_reccomendations();
		Thread.sleep(3000);
		test.info("This is My workout recommendations report");
		test.pass(" my workout rec  pass");
		my_food_genes();
	}

	public static void my_food_genes()throws InterruptedException, IOException {
		Locators_CML.click_myfood_genes();
		Thread.sleep(3000);
		test.info("This is My food genes report");
		test.pass(" my food genes  pass");
		my_workout_genes();
	}

	public static void my_workout_genes()throws InterruptedException, IOException {
		Locators_CML.click_myworkout_genes();
		Thread.sleep(3000);
		test.info("This is My workout genes report");
		test.pass(" my workout genes  pass");
		contactus();
	}
	
	public static void contactus() throws IOException, InterruptedException{
		try {
		Locators_CML.click_contactus();
		//Thread.sleep(1000);										//If we put thread, contactus will work as expected
		test.info("contactUS page is opened here");
		test.pass("contact us opened");
		
		Locators_CML.click_purpose_dropdown();
		//Thread.sleep(1000);
		test.info("tapped on please select");
		test.pass("tapping success");
		
		Locators_CML.click_enquiry();
		//Thread.sleep(1000);
		test.info("tapped and selectes appointments in drop-down");
		test.pass("appoitments option selection success");
	
		Locators_CML.input_subject("Hello this is sample testing for selenium");
		test.info("subject message");
		test.pass("subject passes");
	
		Locators_CML.input_message("Hello this is sample messahe for selenium");
		test.info("subject message");
		test.pass("subject passes");
		
		Locators_CML.click_send_contactus();
		test.info("message sent successfully");
		test.pass("sent conatct us form");
		}
		catch(Exception e) {
			File srcfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);				//Captures Screenshot
			FileUtils.copyFile(srcfile2, new File("Contactus.png"));
		
			test.info(MediaEntityBuilder.createScreenCaptureFromPath("Contactus.png").build());
	
			test.fail("Contact us page not worked");
		}
		change_pwd();
	}


	public static void change_pwd() throws InterruptedException, IOException {

		//Change Password
		locatorsPP.Locators_CML.click_settings_icon();
		Thread.sleep(2000);

		locatorsPP.Locators_CML.click_changepwd();								
		Thread.sleep(3000);

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
