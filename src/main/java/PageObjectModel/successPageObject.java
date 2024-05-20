package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class successPageObject {
	WebDriver driver;
	public successPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private By accountCreated = By.xpath("//h1[text()='Your Account Has Been Created!']");

	public String getConfirmation()
	{
		String s= driver.findElement(accountCreated).getText();
		return s;
	}


}
