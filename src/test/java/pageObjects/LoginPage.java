package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="#whatsapp-number")
	WebElement phoneInputField;
	
	@FindBy(css="select[aria-label='Phone number country']")
	WebElement countryCode;
	
	@FindBy(css="#password")
	WebElement passwordInputField;
	
	@FindBy(css=".MuiTypography-root.MuiTypography-subtitle2.css-1ujv86p")
	WebElement forgotPasswordLinkText;
	
	@FindBy(css="#login-submit")
	WebElement loginButton;
	
	public void setPhoneInputField(String phonenumber) {
		phoneInputField.sendKeys(phonenumber);
	}
	public void selectCountryCode() {
		Select country = new Select(countryCode);
		country.selectByVisibleText("United Kingdom");
	}
	public void setPasswordInputField(String password) {
		passwordInputField.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

}
