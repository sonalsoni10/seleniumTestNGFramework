package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class successfulLoginPageObject {

	WebDriver driver;
	private By myAccountText = By.xpath("//h2[text()= 'My Account']");
	
	 public successfulLoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		 this.driver = driver;
	}

	public String getSuccessfulLogIn()
	 {
		 String s1 = driver.findElement(myAccountText).getText();
		 return s1; 
	 }
}
