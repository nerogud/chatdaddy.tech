package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_003_VerifyUnsuccessfulSignupWithoutFullName extends BaseClass{
	
	@Test
	public void UnsuccessfulSignupWithoutFullName() {
		
		logger.info("***Start VerifyUnsuccessfulSignupWithoutFullName Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		signuppage.selectCountryCallCode();
		signuppage.setPhoneNumberInputField(resourcebundle.getString("PhoneNumber"));
		//intentionally keep Full Name Field empty
		signuppage.setPasswordInputField("Enotee8519#");
		
		
		logger.info("***Assert Test***");
		Assert.assertFalse(signuppage.registerButtonIsEnabled());
		
		
	}
	
	

}
