package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ppLogin {

	public static WebDriver driver;
	
	By username_tap = By.id("user-name");
	
	By password_tap = By.id("password");
	
	By login_tap = By.xpath("//button[@type='submit']");
	
	By myhelprblm_tap = By.xpath("//span[contains(text(),'My Current Health Problems')]");
	
	By threemonactplan_tap = By.xpath("//span[contains(text(),'My 3 month Action Plan')]");
	
	By reports_tap = By.xpath("//span[contains(text(),'Reports')]");
	
	By condsimpro = By.xpath("//span[contains(text(),'Disease conditions I am prone to')]");
	
	By cancerr = By.xpath("//a[contains(text(),'Cancers')]");
	
	By myimmunityy = By.xpath("//span[contains(text(),'My Immunity')]");
	
	By mydietary = By.xpath("//span[contains(text(),'My Dietary Supplements')]");
	
	By myfoodrec = By.xpath("//span[contains(text(),'My Food Recommendations')]");
	
	By sevendaydiet = By.xpath("//span[contains(text(),'7-Day Diet Plan')]");
	
	By medicalist = By.xpath("//span[contains(text(),'My Medication List')]");
	
	By workout = By.xpath("//span[contains(text(),'My Workout Recommendations')]");
	
	By foodgenes = By.xpath("//span[contains(text(),'My Food Genes')]");
	
	By workoutgenes = By.xpath("//span[contains(text(),'My Workout Genes')]");
	
	By contact = By.xpath("//span[contains(text(),'Contact Us')]");
	
	By logoutt = By.xpath("//app-header/app-nav[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]/img[1]"); //logout 
	
	By signout = By.xpath("//button[contains(text(),'SIGN OUT')]"); //sign out pop-up
	
	By contusplsselect_tap = By.xpath("//select[@id='contact-us-types']"); // please select tap
	
	By enquiry_tap = By.xpath("//option[contains(text(),'Enquiry')]"); // selecting enquiry option
	
	By appointments_tap = By.xpath("//option[contains(text(),'Appointments')]"); //selecting appointments
	
	By oldreports_tap =  By.xpath("//option[contains(text(),'Old Reports')]"); // selecting oldreports
	
	By subject_tap = By.xpath("//input[@id='subject']"); // subject
			
	By message_tap = By.xpath("//textarea[@id='message']");// message
	
	By send_tap = By.xpath("//button[contains(text(),'Send')]"); // sending or submitting form
	
	By settingicon_tap = By.xpath("//app-header/app-nav[1]/nav[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/span[1]/img[1]");//settings icon tap

	By changepwd_opt= By.xpath("//a[contains(text(),'Change Password')]"); //selecting changepwd 
	
	By Myprofile_opt = By.xpath("//a[contains(text(),'My Profile')]"); //selecting myprofile
	
	By oldpasswd = By.xpath("//input[@id='currentPassword']"); //enter old password
	
	By newpasswd = By.xpath("//input[@id='password']"); //enter new password
	
	By confirmpasswd = By.xpath("//input[@id='confirmPassword']"); //enter confirm password
	
	By updatepasswd = By.xpath("//button[contains(text(),'UPDATE')]"); //clicking on update pwd
		
	By cancelpasswd = By.xpath("//button[contains(text(),'CANCEL')]"); //clicking on cancel pwd
			
	By picdelete = By.xpath("//body/app-root[1]/div[1]/app-base[1]/div[1]/div[1]/div[2]/div[1]/app-users-base[1]/app-profile[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/img[1]");//profile pic delete-tap on user icon
	
	By delete = By.xpath("//button[contains(text(),'DELETE')]"); //clicking on delepte pic in pop=up
	
	By cancel = By.xpath("//button[contains(text(),'CANCEL')]"); //clicking on cancel pic in pop=up
	
	
	
	
	public ppLogin(WebDriver driver){  //constructor -- calling class name here
		ppLogin.driver = driver;
	}
	
	
	public void username(String text) { 
	driver.findElement(username_tap).sendKeys(text);	
	}
	
	public void password(String text) {
	driver.findElement(password_tap).sendKeys(text);	
	
	}
	
	public void login() {
	driver.findElement(login_tap).click();	
	
	}
	
	public void myhelprb() {
		driver.findElement(myhelprblm_tap).click();	
		
		}
	
	public void mythree() {
		driver.findElement(threemonactplan_tap).click();	
		
		}
	
	public void reports() {
		driver.findElement(reports_tap).click();	
		
		}
	
	public void condimprone() {
		driver.findElement(condsimpro).click();	
		
		}
	
	public void cancer() {
		driver.findElement(cancerr).click();	
		
		}
	
	public void myimmunity() {
		driver.findElement(myimmunityy).click();	
		
		}
	
	public void mydietarrysupp() {
		driver.findElement(mydietary).click();	
		
		}
	
	public void myfoodrecom() {
		driver.findElement(myfoodrec).click();	
		
		}
	
	public void sevenday() {
		driver.findElement(sevendaydiet).click();	
		
		}
	
	
	public void mymediactionlist() {
		driver.findElement(medicalist).click();	
		
		}
	
	public void myworkoutrec() {
		driver.findElement(workout).click();	
		
		}
	
	public void myfoodgenes() {
		driver.findElement(foodgenes).click();	
		
		}
	
	public void myworkoutgenes() {
		driver.findElement(workoutgenes).click();	
		
		}
	
	public void contactus() {
		driver.findElement(contact).click();	
		
		}
	
	public void logout() {
		driver.findElement(logoutt).click();	
		
		}
	
	public void logoutpopsignout() {
		driver.findElement(signout).click();	
		
		}
	
	public void cont_dropdowntap() {
		driver.findElement(contusplsselect_tap).click();	
		
		}
	
	public void enquiry() {
		driver.findElement(enquiry_tap).click();	
		
		}
	
	public void appointments() {
		driver.findElement(appointments_tap).click();	
		
		}
	
	public void oldreports() {
		driver.findElement(oldreports_tap).click();	
		
		}
	
	public void subject(String text) { 
		driver.findElement(subject_tap).sendKeys(text);	
		}
	
	public void message(String text) { 
		driver.findElement(message_tap).sendKeys(text);	
		}
	
	public void send() {
		driver.findElement(send_tap).click();	
		
		}
	
	public void settings_click() {
		driver.findElement(settingicon_tap).click();	
		
		}
	
	public void changepasswordopt() {
		driver.findElement(changepwd_opt).click();	
		
		}
	
	public void myprofileopt() {
		driver.findElement(Myprofile_opt).click();	
		
		}
		
	public void oldpassword(String text) {
		driver.findElement(oldpasswd).sendKeys(text);
		
		}
	
	public void newpassword(String text) {
		driver.findElement(newpasswd).sendKeys(text);
		
		}
	
	public void confirmpwd(String text) {
		driver.findElement(confirmpasswd).sendKeys(text);
		
		}
	
	public void updatepwdclick() {
		driver.findElement(updatepasswd).click();
		
		}
	
	public void cancelpwdclick() {
		driver.findElement(cancelpasswd).click();
		
		}
	
	public void picdelete() {
		driver.findElement(picdelete).click();
		
		}
	
	public void deleteeprofilepic() {
		driver.findElement(delete).click();
		
		}
	
	public void cancelprofilepic() {
		driver.findElement(cancel).click();
		
		}
}
