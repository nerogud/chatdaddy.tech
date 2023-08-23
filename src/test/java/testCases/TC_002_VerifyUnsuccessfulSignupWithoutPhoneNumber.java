package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_002_VerifyUnsuccessfulSignupWithoutPhoneNumber extends BaseClass{
	
	@Test
	public void UnsuccessfulSignupWithoutPhoneNumber() {
		
		logger.info("***Start VerifyUnsuccessfulSignupWithoutPhoneNumber Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		signuppage.selectCountryCallCode();
		//intentionally keep Phone Number Field empty
		signuppage.setFullNameInputField(resourcebundle.getString("FullName"));
		signuppage.setPasswordInputField("Enotee8519#");
		
		
		logger.info("***Assert Test***");
		Assert.assertFalse(signuppage.registerButtonIsEnabled());
		
		
	}
	
	

}
