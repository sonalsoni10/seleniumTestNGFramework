package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addToCartPageObject {

	public WebDriver driver;
	private By search = By.xpath("//input[@name='search']");
	private By getIPhonePrice = By.xpath("//p[@class='price']");
	//private By aDdToCart = By.xpath("//span[text()='Add to Cart']");
	private By aDdToCart = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By myCart = By.xpath("//span[@id='cart-total']");
	private By getSamsungTabPrice = By.xpath("(//p[@class='price'])[2]");
	private By getTotalFromCart = By.xpath("(//td[@class='text-right'])[12]");
	private By samsungADdToCart =  By.xpath("(//i[@class='fa fa-shopping-cart'])[5]");
	public addToCartPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement enterSearchBox()
	{
		return driver.findElement(search);
	}
	public double getIPhonePrice()
	{
		String s = driver.findElement(getIPhonePrice).getText();
		String cost =replaceAllnumber(s);
		 double d = Double.parseDouble(cost);
			return d;
	
	}
	public double getSamsungTabPrice()
	{
		String s = driver.findElement(getSamsungTabPrice).getText();
		String cost =replaceAllnumber(s);
		 double d = Double.parseDouble(cost);
			return d;
	
	}
	
	public WebElement clickOnAddToCart()
	{
		return driver.findElement(aDdToCart);
	}
	public WebElement clickSamsungAddToCart()
	{
		return driver.findElement(samsungADdToCart);
	}
	public WebElement clickOnMyCart()
	{
		return driver.findElement(myCart);
	}
	public String getTotalFromMyCart()
	{
		String total = driver.findElement(getTotalFromCart).getText();
		return total;
	}
	public String replaceAllnumber(String s)
	{
		String iArray[] = s.split(" ");
		//System.out.println(iArray.toString());
		
		
		 String str = iArray[0];
		 str = str.replaceAll("[^\\d.]", "");		 
		return str;
	}
}
