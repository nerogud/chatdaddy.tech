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
		HomePage homepage = new HomePage(driver);
		//homepage.selectEnglishLanguageOption();
		homepage.clickSignupButton();
		
		SignupPage signuppage = new SignupPage(driver);
		signuppage.selectCountryCallCode();
		signuppage.setPhoneNumberInputField("07459374009");
		signuppage.setFullNameInputField("Oren Edugo");
		signuppage.setPasswordInputField("Enotee8519#");
		signuppage.clickRegisterButton();
		
		SignupVerificationPage signupverificationpage = new SignupVerificationPage(driver);
		
		Assert.assertTrue(signupverificationpage.confirmVerificationText());
		
		
	}
	
	

}
