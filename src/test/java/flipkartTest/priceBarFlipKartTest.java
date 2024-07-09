package flipkartTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class priceBarFlipKartTest {

	@Test
	public void verifyPriceBar() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		
		//click on mobiles....
		driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[2]")).click();
		//click on view all
		driver.findElement(By.xpath("(//span[text()='VIEW ALL'])[1]")).click();
		 Actions a = new Actions(driver);
		Thread.sleep(4000);
		WebElement source=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]")); 
		Thread.sleep(4000);
		WebElement target=driver.findElement(By.xpath("(//div[@class='PYKUdo'])[2]")); 
		Thread.sleep(4000);
		a.dragAndDropBy(source, 50, 0).build().perform();
		
		Thread.sleep(4000);
		a.dragAndDropBy(target, -30, 0).build().perform();
		
	}
	
}
