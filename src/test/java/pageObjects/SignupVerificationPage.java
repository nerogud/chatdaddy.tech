package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupVerificationPage extends BasePage{

	public SignupVerificationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css=".MuiTypography-root.MuiTypography-h5.css-14tzbo2")
	WebElement verificationText;
	
	public boolean confirmVerificationText() {
		return verificationText.isDisplayed();
	}

}
