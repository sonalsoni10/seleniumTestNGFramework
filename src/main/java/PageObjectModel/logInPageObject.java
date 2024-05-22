package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.commonMethod;

public class logInPageObject {

	WebDriver driver;
	
	private By LoginEmailAddress = By.xpath("//input[@name='email']");
	private By LoginPassword = By.xpath("//input[@name='password']");
	private By LoginButton = By.xpath("//input[@value='Login']");
	private By loginFailesAlert = By.xpath("//div[text()=' Warning: No match for E-Mail Address and/or Password.']");
			
	public logInPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement enterLogInEmailAddress()
	{
		return driver.findElement(LoginEmailAddress);
	}
	
	public WebElement enterLogInPassword()
	{
		return driver.findElement(LoginPassword);
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(LoginButton);
	}
	
	public String GetLoginFDailedAlert()
	{
		commonMethod.handleExplicitWait(driver, 4, driver.findElement(loginFailesAlert) );
	
		String s1 = driver.findElement(loginFailesAlert).getText();
				return s1;
	}
	
}

