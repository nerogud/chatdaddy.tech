package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_005_VerifyPhoneNumberFieldWillNotAcceptAlphabets extends BaseClass{
	
	@Test
	public void SignupTestWithValidCredentials() {
		
		logger.info("***Start VerifySuccessfulSignUpWithValidCredentials Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		signuppage.selectCountryCallCode();
		signuppage.setPhoneNumberInputField(getRandomString());
		signuppage.setFullNameInputField(resourcebundle.getString("FullName"));
		signuppage.setPasswordInputField("Enotee8519#");
		
		
		logger.info("***Assert Test***");
		Assert.assertFalse(signuppage.registerButtonIsEnabled());
		
		
	}
	
	

}
