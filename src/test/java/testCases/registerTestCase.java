package testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.homePageObject;
import PageObjectModel.registerPageObject;
import PageObjectModel.successPageObject;
import resources.baseClass;
import resources.commonMethod;
import resources.testData;

public class registerTestCase extends baseClass{

	@Test(priority =0, enabled = true)
	public void verifyRegistrationwithValidData() throws IOException, InterruptedException
	{
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		  
	
		
		// Thread.sleep(4000);
		 homePageObject hpo = new homePageObject(driver);
		 
		 commonMethod.handleExplicitWait(driver, 3, hpo.clickOnMyAccount());
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnRegister().click();
		// Thread.sleep(4000);
		 registerPageObject rpo = new registerPageObject(driver);
		 commonMethod.handleExplicitWait(driver, 3, rpo.enterFirstName());
		 rpo.enterFirstName().sendKeys(testData.firstName);
		 rpo.enterLastNAme().sendKeys(testData.lastName);
		 rpo.enterEmailId().sendKeys(emailId);
		 System.out.println(emailId);
		 rpo.enterTelePhoneNo().sendKeys(testData.telePhoneNo);
		 rpo.enterPassword().sendKeys(testData.password);
		 System.out.println(testData.password);
		 rpo.enterConfirmPassword().sendKeys(testData.confirmPassword);
		 rpo.checkPrivecyPolicy().click();
		 rpo.clickOnContinue().click();
		 Thread.sleep(3000);
		successPageObject spo = new successPageObject(driver);
		
		 String actual = spo.getConfirmation();
		 String expected =testData.registerAccountConfirmExpected;
		commonMethod.handleAssertion(actual, expected);
	}
	
	@Test(priority =1, enabled = true)
	public void verifyRegistrationwithInValidData() throws IOException, InterruptedException
	{
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		  
		 
		
		// Thread.sleep(4000);
		 homePageObject hpo = new homePageObject(driver);
		 commonMethod.handleExplicitWait(driver, 4, hpo.clickOnMyAccount());
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnRegister().click();
		// Thread.sleep(4000);
		 registerPageObject rpo = new registerPageObject(driver);
		 commonMethod.handleExplicitWait(driver, 3, rpo.enterFirstName());
		 
		 rpo.enterFirstName().sendKeys(testData.firstName);
		 rpo.enterLastNAme().sendKeys(testData.lastName);
		 rpo.enterEmailId().sendKeys(emailId);
		 rpo.enterTelePhoneNo().sendKeys(testData.telePhoneNo);
		 rpo.enterPassword().sendKeys(testData.password);
		 rpo.enterConfirmPassword().sendKeys(testData.confirmPassword);
		 rpo.checkPrivecyPolicy().click();
		 rpo.clickOnContinue().click();
		Thread.sleep(3000);
		
		 //commonMethod.handleExplicitWait(driver, 3, rpo.getEmailAlert());
		 String actual = rpo.getEmailAlert();
		 String expected = testData.emailAlertMessageExpected;
		 commonMethod.handleAssertion(actual, expected);
	
		 //driver.quit();
	}
	
	@Test(priority = 2, enabled = true)
	public void verifyRegistrationwithBlankValidData() throws IOException, InterruptedException
	{
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 
		
		
		// Thread.sleep(4000);
		 homePageObject hpo = new homePageObject(driver);
		
		 commonMethod.handleExplicitWait(driver, 4, hpo.clickOnMyAccount());
		 hpo.clickOnMyAccount().click();
		 hpo.clickOnRegister().click();
		//Thread.sleep(4000);
		 registerPageObject rpo = new registerPageObject(driver);
		 System.out.println("hello");
		 commonMethod.handleExplicitWait(driver, 4,  rpo.clickOnContinue());
		 
		 rpo.clickOnContinue().click();
		 System.out.println("hii");
		 //checking error message
		 Thread.sleep(4000);
		 String actual = rpo.getFIrstNameErrorMessage();
		 String expected = testData.firstNameErrorMessageExpected;		
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("1");
		 actual = rpo.getLastNameErrorMessage();
		 expected = testData.lastNameErrorMessageExpected;
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("2");
		 actual = rpo.getEmailErrorMessage();
		 expected =testData.emailErrorMessageExpected;
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("3");
		 actual = rpo.getTelephoneErrorMessage();
		 expected = testData.telephoneErrorMessageExpected;
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("4");
		 actual = rpo.getPasswordErrorMessage1();
		 expected = testData.passwordErrorMessageExpected;
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("5");
		 /* 
		 actual = rpo.getConfirmPasswordErrorMessage1();
		 expected = "Password confirmation does not match password!";
		 sa.assertEquals(actual, expected); */
		 
		 actual = rpo.getPrivacyPolicyAlert();
		 expected =testData.privacyPolicyAlertExpected;
		 commonMethod.handleAssertion(actual, expected);
		 System.out.println("6");
	}
	
	
}
