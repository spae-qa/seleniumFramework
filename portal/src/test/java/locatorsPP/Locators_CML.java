
//All Locators of PP : Test Starts in TestScripts.PP_All_Functions.java

package locatorsPP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Locators_CML {		

	static WebDriver driver;
	public Locators_CML(WebDriver driver) {			//constructor to avoid ambiguity as we're taking driver obj in many places
		Locators_CML.driver = driver;
	}

	// Locators

	static By textbox_username = By.id("user-name");

	static By textbox_password = By.id("password");

	static By button_login = By.xpath("//button[@type='submit']");

	static By option_mycurrent_health_problems = By.xpath("//span[contains(text(),'My Current Health Problems')]");        //my current health problems

	static By option_mythree_month_action_plan = By.xpath("//span[contains(text(),'My 3 month Action Plan')]");                 //my 3 month action plan

	static By option_reports = By.xpath("//span[contains(text(),'Reports')]");												//reports

	static By option_conditions_prone_to = By.xpath("//span[contains(text(),'Disease conditions I am prone to')]");			//Conditions i'm prone to

	static By option_cancer = By.xpath("//a[contains(text(),'Cancers')]");													//Cancers

	static By option_diseases = By.xpath("//a[contains(text(),'Diseases')]");												//Diseases

	static By option_myimmunity = By.xpath("//span[contains(text(),'My Immunity')]");									//My Immunity

	static By option_mydietary_supplements = By.xpath("//span[contains(text(),'My Dietary Supplements')]");				//My dietary supplements

	static By option_myfood_rec = By.xpath("//span[contains(text(),'My Food Recommendations')]");					//My food recommendations

	static By option_seven_day_diet = By.xpath("//span[contains(text(),'7-Day Diet Plan')]");						//my 7 day diet plan

	static By option_mymedication_list = By.xpath("//span[contains(text(),'My Medication List')]");					//my medication list

	static By option_myworkout_rec = By.xpath("//span[contains(text(),'My Workout Recommendations')]");				//My workout recommendations

	static By option_myfood_genes = By.xpath("//span[contains(text(),'My Food Genes')]");							//My food genes

	static By option_workout_genes = By.xpath("//span[contains(text(),'My Workout Genes')]");						//My workout genes

	static By option_contactus = By.xpath("//span[contains(text(),'Contact Us')]");                                 //contact us

	static By dropdown_contact_purpose = By.xpath("//select[@id='contact-us-types']");                           // purpose dropdown

	static By option_enquiry = By.xpath("//option[contains(text(),'Enquiry')]"); 								// selecting enquiry option

	static By option_appointments = By.xpath("//option[contains(text(),'Appointments')]"); 						//selecting appointments

	static By option_oldreports =  By.xpath("//option[contains(text(),'Old Reports')]"); 					// selecting oldreports

	static By option_subject = By.xpath("//input[@id='subject']"); 												// subject

	static By option_message = By.xpath("//textarea[@id='message']");											// message

	static By button_send = By.xpath("//button[contains(text(),'Send')]"); 										// sending or submit

	static By button_settings = By.xpath("//app-header/app-nav[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[1]/img[1]");		//settings icon

	static By option_changepwd = By.xpath("//a[contains(text(),'Change Password')]");							//change password option

	static By option_myprofile = By.xpath("//a[contains(text(),'My Profile')]");								//my profile option

	static By textbox_currentpwd = By.xpath("//input[@id='currentPassword']");									//input current password

	static By textbox_pwd = By.xpath("//input[@id='password']");												//input new password

	static By textbox_confirmpwd = By.xpath("//input[@id='confirmPassword']");								//input confirm new password

	static By button_update_pwd = By.xpath("//button[contains(text(),'UPDATE')]");								//update button

	static By button_cancel_pwd = By.xpath("//button[contains(text(),'CANCEL')]");                             //cancel button

	static By del_profilepic_icon = By.xpath("//body[1]/app-root[1]/div[1]/app-base[1]/div[1]/div[1]/div[2]/div[1]/app-users-base[1]/app-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/img[1]");	

	static By button_del_profilepic = By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-kh-modal[1]/div[1]/div[3]/button[2]");     //del option in confirmation popup

	static By button_cancel_profilepic = By.xpath("//button[contains(text(),'CANCEL')]");               //cancel button in del confirmation popup

	static By logout_icon = By.xpath("//body[1]/app-root[1]/div[1]/app-base[1]/div[1]/div[1]/div[2]/app-header[1]/app-nav[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]/img[1]");   //logout icon

	static By logout_button = By.xpath("//body[1]/ngb-modal-window[1]/div[1]/div[1]/app-kh-modal[1]/div[1]/div[3]/button[2]");				//logout button in confirmation popup


	//defining functions for actions


	public static void input_username(String text) { 
		driver.findElement(textbox_username).sendKeys(text);										//input user name
	}

	public static void input_password(String text) {
		driver.findElement(textbox_password).sendKeys(text);										//input pwd
	}

	public static void click_login() {
		driver.findElement(button_login).click();													//click action of login
	}

	public static void click_mycurrent_health_problems() {
		driver.findElement(option_mycurrent_health_problems).click();						// click action of mycurrent_health_problems
	}

	public static void click_my3month_action_plan() {
		driver.findElement(option_mythree_month_action_plan).click();									//click action of my 3 month action plan
	}

	public static void click_reports() {
		driver.findElement(option_reports).click();										// click action of reports
	}

	public static void click_disease_conditions_improne_to() {
		driver.findElement(option_conditions_prone_to).click();						//click action of disease conditions i'm prone to
	}

	public static void click_cancer() {
		driver.findElement(option_cancer).click();								//click action of my dietary supplements
	}

	public static void click_myimmunity() {
		driver.findElement(option_myimmunity).click();								//click action of my immunity	
	}

	public static void click_mydietary_supplements() {
		driver.findElement(option_mydietary_supplements).click();						//click action of my dietary supplements
	}

	public static void click_myfood_recommendations() {
		driver.findElement(option_myfood_rec).click();									//click action of my food recommendations
	}

	public static void click_7day_dietplan() {
		driver.findElement(option_seven_day_diet).click();								//click action of 7 day diet plan
	}

	public static void click_mymediaction_list() {
		driver.findElement(option_mymedication_list).click();							//click action of my medication list
	}

	public static void click_myworkout_reccomendations() {
		driver.findElement(option_myworkout_rec).click();									//click action of my workout recommendations
	}

	public static void click_myfood_genes() {
		driver.findElement(option_myfood_genes).click();								//click action of my food genes
	}

	public static void click_myworkout_genes() {
		driver.findElement(option_workout_genes).click();									//click action workout genes
	}

	public static void click_contactus() {
		driver.findElement(option_contactus).click();							//click action of contact us
	}

	public static void click_purpose_dropdown() {
		driver.findElement(dropdown_contact_purpose).click();					//click action of contact us - purpose dropdown
	}

	public static void click_enquiry() {
		driver.findElement(option_enquiry).click();									//choosing enquiry option in purpose dropdown
	}

	public static void click_appointments() {
		driver.findElement(option_appointments).click();								//choosing appointments in purpose dropdown
	}

	public static void click_oldreports() {
		driver.findElement(option_oldreports).click();								//choosing old reports in purpose dropdown
	}

	public static void input_subject(String text) { 
		driver.findElement(option_subject).sendKeys(text);								//input subject									
	}

	public static void input_message(String text) { 
		driver.findElement(option_message).sendKeys(text);									//input message
	}

	public static void click_send_contactus() {
		driver.findElement(button_send).click();												//click action of send in contact us	
	}

	public static void click_settings_icon() throws InterruptedException {  					//click Action of settings icon
		driver.findElement(button_settings).click();
		Thread.sleep(4000);
	}

	public static void click_changepwd() throws InterruptedException {							//click Action of changepwd option in settings drop down
		driver.findElement(option_changepwd).click();
		Thread.sleep(4000);
	}

	public static void input_currentpwd(String pwd) throws InterruptedException {				//current pwd inpu
		driver.findElement(textbox_currentpwd).sendKeys(pwd);
		Thread.sleep(4000);
	}

	public static void input_pwd(String pwd) throws InterruptedException {						//new pwd
		driver.findElement(textbox_pwd).sendKeys(pwd);
		Thread.sleep(4000);
	}


	public static void input_confirmpwd(String pwd) throws InterruptedException {				//confim new
		driver.findElement(textbox_confirmpwd).sendKeys(pwd);
		Thread.sleep(4000);
	}


	public static void click_update_pwd() throws InterruptedException {								//click Action of update
		driver.findElement(button_update_pwd).click();
		Thread.sleep(4000);
	}

	public static void click_cancel_pwd() throws InterruptedException {								//click Action of cancel pwd
		driver.findElement(button_cancel_pwd).click();
		Thread.sleep(4000);
	}   

	public static void click_myprofile() throws InterruptedException {							//click Action of My profile icon
		driver.findElement(option_myprofile).click();
	}

	public static void click_del_profilepic() throws InterruptedException {						//click action of delete profile pic icon
		driver.findElement(del_profilepic_icon).click();
	}

	public static void click_del_profilepic_button() throws InterruptedException {			//Delete button in confirmation Popup
		driver.findElement(button_del_profilepic).click();
	}

	public static void click_cancel_profilepic_button() throws InterruptedException {			//cancel button in confirmation Popup
		driver.findElement(button_cancel_profilepic).click();
	}  

	public static void click_logout_icon() throws InterruptedException {					//Logout icon click action
		driver.findElement(logout_icon).click();
	}

	public static void click_logout_button() throws InterruptedException {					//Logout button in confirmation Popup
		driver.findElement(logout_button);
	}


}

