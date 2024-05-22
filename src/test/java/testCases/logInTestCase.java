package testCases;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.homePageObject;
import PageObjectModel.logInPageObject;
import PageObjectModel.successfulLoginPageObject;
import resources.baseClass;
import resources.commonMethod;
import resources.testData;

public class logInTestCase extends baseClass {
@Test(priority = 4, enabled = true)
	public void verifyLoginWithValidData() throws IOException, InterruptedException
	{
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		  
			
		// Thread.sleep(4000);
		 homePageObject hpo = new homePageObject(driver);
		 commonMethod.handleExplicitWait(driver, 3, hpo.clickOnMyAccount());
		 
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnLogin().click();
		 
		
		// Thread.sleep(4000);
		 
		 logInPageObject lpo= new logInPageObject(driver);
		commonMethod.handleExplicitWait(driver, 3, lpo.enterLogInEmailAddress());
		 
		 lpo.enterLogInEmailAddress().sendKeys(emailId);
		 lpo.enterLogInPassword().sendKeys(testData.password);
		 lpo.clickOnLogin().click();
		
		 successfulLoginPageObject sfpo = new successfulLoginPageObject(driver);
		
		 Thread.sleep(4000);
		 String actual = sfpo.getSuccessfulLogIn();
 		 System.out.println(actual);
 		 
		 String  expected = testData.successfulLoginMessageExpected;
		commonMethod.handleAssertion(actual, expected);
	}
	
	@Test(priority = 5)
	public void verifyLogInWithInvalidDate() throws InterruptedException
	{

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		  
			
		// Thread.sleep(4000);
		 homePageObject hpo = new homePageObject(driver);
		 commonMethod.handleExplicitWait(driver, 3, hpo.clickOnMyAccount());
		 
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnLogin().click();
		 
		
		 Thread.sleep(4000);
		 
		 logInPageObject lpo= new logInPageObject(driver);
		 
		 commonMethod.handleExplicitWait(driver, 3, lpo.enterLogInPassword());
		 lpo.enterLogInPassword().sendKeys(testData.password);
		 lpo.clickOnLogin().click();
		 System.out.println("hello");
		 String actual= lpo.GetLoginFDailedAlert();
		 String expected = testData.loginFailesAlertMessageExpected;
		commonMethod.handleAssertion(actual, expected);
	}
	
}
