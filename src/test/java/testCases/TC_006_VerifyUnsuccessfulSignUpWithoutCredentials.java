package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_006_VerifyUnsuccessfulSignUpWithoutCredentials extends BaseClass{
	
	@Test
	public void UnsuccessfulSignUpWithoutCredentials() {
		
		logger.info("***Start VerifyUnsuccessfulSignUpWithoutCredentials Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		//intentionally keep country call code field blank
		//intentionally keep phone number field blank
		//intentionally keep full name field blank
		//intentionally keep password field blank
		
		logger.info("***Assert Test***");
		Assert.assertFalse(signuppage.registerButtonIsEnabled());
		
		
	}
	
	

}
