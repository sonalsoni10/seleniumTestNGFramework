package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObject {

	public WebDriver driver;
	private By MyAccount = By.xpath("//i[@class='fa fa-user']");
	private By Register = By.xpath("//a[text() = 'Register']");
	private By Login = By.xpath("//a[text() = 'Login']");
	
	


	public homePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}



	public WebElement clickOnMyAccount()
	{
		return driver.findElement(MyAccount);
	}
	
	
	public WebElement clickOnRegister()
	{
		return driver.findElement(Register);
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(Login);
	}
	
	
	
}
