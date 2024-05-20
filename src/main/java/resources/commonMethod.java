package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethod {

	public static void handleAssertion(String actual, String expected)
	{
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(actual, expected);
		 
		 sa.assertAll();
	}
	
	public static void handleExplicitWait(WebDriver driver, int time, WebElement element )
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.visibilityOf(element));
		 
	}
	
}
