package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class registerPageObject  {
	
		 public WebDriver driver;
		 private By FirstName = By.xpath("//input[@name ='firstname']");
		 private By LastName =  By.xpath("//input[@name ='lastname']");
		 private By Email = By.xpath("//input[@name ='email']");
		 private By Telephone =  By.xpath("//input[@name ='telephone']");
		 private By Password =  By.xpath("//input[@name ='password']");
		 private By PasswordConfirm =  By.xpath("//input[@name ='confirm']");
		 private By PrivacyPolicy =  By.xpath("//input[@name ='agree']");
		 private By Continue =  By.xpath("//input[@value='Continue']");
		 
		//for blank 
		 private By FirstNameErrorMsg = By.xpath("(//div[@class='text-danger'])[1]");
		 private By LastNameErrorMsg = By.xpath("(//div[@class='text-danger'])[2]");
		 protected By emailErrorMsg = By.xpath("(//div[@class='text-danger'])[3]");
		 protected By TelephoneErrorMsg = By.xpath("(//div[@class='text-danger'])[4]");
		 protected By passwordErrorMsg =By.xpath("(//div[@class='text-danger'])[5]");
		 protected By privacyPolicyAlert = By.xpath("//div[text()= ' Warning: You must agree to the Privacy Policy!']");
		 protected By confirmPasswordErrorMessage = By.xpath("//div[text() = 'Password confirmation does not match password!']");
		 protected By emailAlertmsg = By.xpath("//div[text() = ' Warning: E-Mail Address is already registered!']");
		
		 public registerPageObject(WebDriver driver) {
			// TODO Auto-generated constructor stub
			 
			 this.driver = driver;
			 
		}
		public WebElement enterFirstName()
		 {
			 return driver.findElement(FirstName);
		 }
		 public WebElement enterLastNAme()
		 {
			 return driver.findElement(LastName);
		 }
		 public WebElement enterEmailId()
		 {
			return driver.findElement(Email);
		 }
		 
		 public WebElement enterTelePhoneNo()
		 {
			return driver.findElement(Telephone);
		 }
		 
		 public WebElement enterPassword()
		 {
			 return driver.findElement(Password);
		 }
		 public WebElement enterConfirmPassword()
		 {
			 return driver.findElement(PasswordConfirm);
		 }
		 public WebElement checkPrivecyPolicy()
		 {
			 return driver.findElement(PrivacyPolicy);
		 }
		 public WebElement clickOnContinue()
		 {
			 return driver.findElement(Continue);
		 }
		 
		 //for Blank
		 public String getFIrstNameErrorMessage()
		 {
			String s1= driver.findElement(FirstNameErrorMsg).getText();
		
		 return s1;
		 }
		 public String getEmailAlert()
		 {
			 String s1 = driver.findElement(emailAlertmsg).getText();
			 return s1;
		 }
		public String getLastNameErrorMessage()
		{
			 String s1 = driver.findElement(LastNameErrorMsg).getText();
			 return s1; 
		}
		 public String getEmailErrorMessage()
		 {
			 String s1 = driver.findElement(emailErrorMsg).getText();
			 return s1; 
		 }
		
		 public String getTelephoneErrorMessage()
		 {
			 String s1 = driver.findElement(TelephoneErrorMsg).getText();
			 return s1; 
		 }
		 
		 public String getPasswordErrorMessage1()
		 {
			 String s1 = driver.findElement(passwordErrorMsg).getText();
			 return s1; 
		 }
		 public String getConfirmPasswordErrorMessage1()
		 {
			 String s1 = driver.findElement(confirmPasswordErrorMessage).getText();
			 return s1; 
		 }
		 public String getPrivacyPolicyAlert()
		 {
			 String s1 = driver.findElement(privacyPolicyAlert).getText();
			 return s1; 
		 }
	}
	
	


