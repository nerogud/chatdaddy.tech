package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{

	public SignupPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css=".MuiButtonBase-root.MuiTab-root.MuiTab-textColorPrimary.MuiTab-fullWidth.Mui-selected.css-1tqzc0m")
	WebElement signupButton;
	
	@FindBy(css="button[class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary MuiTab-fullWidth css-1tqzc0m']")
	WebElement loginButton;
	
	@FindBy(css=".MuiButtonBase-root.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.MuiButton-root.MuiButton-outlined.MuiButton-outlinedPrimary.MuiButton-sizeMedium.MuiButton-outlinedSizeMedium.css-1ftxuc4")
	WebElement signInWithGoogleButton;
	
	@FindBy(css="select[aria-label='Phone number country']")
	WebElement countryCallCode;
	
	@FindBy(css="#whatsapp-number")
	WebElement phoneNumberInputField;
	
	@FindBy(css="#fullName")
	WebElement fullNameInputField;
	
	@FindBy(css="#password")
	WebElement passwordInputField;
	
	@FindBy(css="button[aria-label='toggle password visibility']")
	WebElement passwordToggleButton;
	
	@FindBy(css=".MuiTypography-root.MuiTypography-subtitle2.css-1ujv86p")
	WebElement forgotPasswordLinkText;
	
	@FindBy(css="a[href='https://www.chatdaddy.tech/terms/terms-of-services']")
	WebElement termsOfServiceLinkText;
	
	@FindBy(css="a[href='https://www.chatdaddy.tech/terms/privacy-policy']")
	WebElement privacyPolicyLinkText;
	
	@FindBy(css="#login-submit")
	WebElement registerButton;
	
	@FindBy(css="#whatsapp-number-label")
	WebElement phoneNumberLabel;
	
	@FindBy(css="#fullName-label")
	WebElement fullNameLabel;
	
	@FindBy(css="#password-label")
	WebElement passwordLabel;
	
	public void clickSignupButton() {
		signupButton.click();
	}
	public boolean signupButtonIsDisplayed() {
		return signupButton.isDisplayed();
	}
	public boolean signupButtonIsEnabled() {
		return signupButton.isEnabled();
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public boolean loginButtonIsEnabled() {
		return loginButton.isEnabled();
	}
	public boolean loginButtonIsDisplayed() {
		return loginButton.isDisplayed();
	}
	public void clickSignInWithGoogleButton() {
		signInWithGoogleButton.click();
	}
	public boolean signInWithGoogleButtonIsDisplayed() {
		return signInWithGoogleButton.isDisplayed();
	}
	public boolean signInWithGoogleButtonIsEnabled() {
		return signInWithGoogleButton.isEnabled();
	}
	public void selectCountryCallCode() {
		Select callCode = new Select(countryCallCode);
		callCode.selectByVisibleText("United KIngdom");
	}
	public void setPhoneNumberInputField(String phonenumber) {
		phoneNumberInputField.sendKeys(phonenumber);
	}
	public void setFullNameInputField(String fullname) {
		fullNameInputField.sendKeys(fullname);
	}
	public void setPasswordInputField(String password) {
		passwordInputField.sendKeys(password);
	}
	public boolean checkPasswordToggleButtonIsDisplayed() {
		return passwordToggleButton.isDisplayed();
	}
	public boolean checkForgotPasswordLinkTextIsDisplayed() {
		return forgotPasswordLinkText.isDisplayed();
	}
	public boolean checkForgotPasswordLinkTextIsEnabled() {
		return forgotPasswordLinkText.isEnabled();
	}
	public void clickForgotPasswordLinkText() {
		forgotPasswordLinkText.click();
	}
	public boolean termsOfServiceLinkTextIsEnabled() {
		return termsOfServiceLinkText.isEnabled();
	}
	public void clickTermsOfServiceLinkText() {
		termsOfServiceLinkText.click();;
	}
	public boolean privacyPolicyLinkTextIsEnabled() {
		return privacyPolicyLinkText.isEnabled();
	}
	public void clickprivacyPolicyLinkText() {
		privacyPolicyLinkText.click();;
	}
	public void clickRegisterButton() {
		registerButton.click();
	}
	public boolean checkPhoneNumberLabelIsDisplayed() {
		return phoneNumberLabel.isDisplayed();
	}
	public boolean checkFullNameLabelIsDisplayed() {
		return fullNameLabel.isDisplayed();
	}
	public boolean checkPasswordLabelIsDisplayed() {
		return passwordLabel.isDisplayed();
	}
	
	

}
