package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignupPage;
import pageObjects.SignupVerificationPage;
import testBase.BaseClass;

public class TC_004_VerifyUnsuccessfulSignupWithoutPassword extends BaseClass{
	
	@Test
	public void UnsuccessfulSignupWithoutPassword() {
		
		logger.info("***Start VerifyUnsuccessfulSignupWithoutPassword Test***");
		HomePage homepage = new HomePage(driver);
		homepage.clickSignupButton();
		logger.info("***Signup button clicked***");
		
		SignupPage signuppage = new SignupPage(driver);
		
		logger.info("***Enter user details***");
		signuppage.selectCountryCallCode();
		signuppage.setFullNameInputField(resourcebundle.getString("FullName"));
		signuppage.setPhoneNumberInputField(resourcebundle.getString("PhoneNumber"));
		//intentionally keep Password Field empty
		
		
		logger.info("***Assert Test***");
		Assert.assertFalse(signuppage.registerButtonIsEnabled());
		
		
	}
	
	

}
