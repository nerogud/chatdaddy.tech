package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_001_VerifySuccessfulSignUpWithValidCredentials extends BaseClass{
	
	@Test
	public void SignupTestWithValidCredentials() {
		
		logger.info("***Start VerifySuccessfulSignUpWithValidCredentials Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		signuppage.selectCountryCallCode();
		signuppage.setPhoneNumberInputField(resourcebundle.getString("PhoneNumber"));
		signuppage.setFullNameInputField(resourcebundle.getString("FullName"));
		signuppage.setPasswordInputField("Enotee8519#");
		signuppage.clickRegisterButton();
		
		SignupVerificationPage signupverificationpage = new SignupVerificationPage(driver);
		
		logger.info("***Assert Test***");
		Assert.assertTrue(signupverificationpage.confirmVerificationText());
		
		
	}
	
	

}
