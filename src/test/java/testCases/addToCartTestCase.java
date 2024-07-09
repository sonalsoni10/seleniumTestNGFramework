package testCases;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import PageObjectModel.addToCartPageObject;
import PageObjectModel.homePageObject;
import PageObjectModel.logInPageObject;
import resources.baseClass;
import resources.commonMethod;
import resources.testData;


public class addToCartTestCase extends baseClass {
	@Test
	public void verifyAddToCart() throws InterruptedException
	{
		driver.manage().window().maximize();
		//click on my account
		homePageObject hpo = new homePageObject(driver);
		commonMethod.handleExplicitWait(driver, 3, hpo.clickOnMyAccount());
		 
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnLogin().click();
		
		 //enter email address and password
		 	logInPageObject lpo= new logInPageObject(driver);
		 	commonMethod.handleExplicitWait(driver, 3, lpo.enterLogInEmailAddress());
			 
			 lpo.enterLogInEmailAddress().sendKeys(testData.loginWithEmailId);
			 lpo.enterLogInPassword().sendKeys(testData.password);
			 lpo.clickOnLogin().click();
	
			 //enter iphone into search Box
			 
			 addToCartPageObject acpo =new addToCartPageObject(driver);
			 acpo.enterSearchBox().sendKeys(testData.searchIphoneText + Keys.ENTER);
			 
			 Thread.sleep(3000);
			 //get selected iphone price
			 double iphonePrice = acpo.getIPhonePrice();
			 System.out.println(iphonePrice);
			 Thread.sleep(3000);
			 //addt to cart
			 acpo.clickOnAddToCart().click();
			 Thread.sleep(3000);
			 //clear search box
			 acpo.enterSearchBox().clear();
			 Thread.sleep(4000);
			 //enter samsung into search box
			 acpo.enterSearchBox().sendKeys(testData.searchSamsungText + Keys.ENTER);
			 Thread.sleep(3000);
			 //get samsung galaxy tab price
			 
			 double samsungTabPrice = acpo.getSamsungTabPrice();
			 System.out.println(samsungTabPrice);
			 
			 //get total of both product before adding to cart
			 double total = iphonePrice + samsungTabPrice;
			
			 String totalBeforeAddingToCart ="$"+ String.valueOf(total);
			 System.out.println(totalBeforeAddingToCart);
			 //add to cart`
			 acpo.clickSamsungAddToCart().click();
			 Thread.sleep(3000);
			 //move to cart 
			 acpo.clickOnMyCart().click();
			 //get total from cart
			 Thread.sleep(3000);
			 String totalFromMyCart = acpo.getTotalFromMyCart();
			 System.out.println(totalFromMyCart);
			 //compare both value
			 if(totalBeforeAddingToCart.equalsIgnoreCase(totalFromMyCart))
			 {
				 System.out.println("total amount is same");
			 }
			 else
			 {
				 System.out.println("total amount is different");
			 }
			 driver.quit();
	}
	
	
	
}
