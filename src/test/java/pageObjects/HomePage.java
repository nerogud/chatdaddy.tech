package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css="img[alt='logo']")
	WebElement chatdaddyLogo;
	
	@FindBy(css="div[role='button']")
	WebElement languageOptionDropdownButton;
	
	@FindBy(css=".MuiButtonBase-root.MuiTab-root.MuiTab-textColorPrimary.MuiTab-fullWidth.Mui-selected.css-1tqzc0m")
	WebElement signupButton;
	
	@FindBy(css="button[class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary MuiTab-fullWidth css-1tqzc0m']")
	WebElement loginButton;
	
	public boolean chatdaddyLogoIsDisplayed() {
		return chatdaddyLogo.isDisplayed();
	}
	public boolean languageOptionDropdownButtonIsDisplayed() {
		return languageOptionDropdownButton.isDisplayed();
	}
	public boolean languageOptionDropdownButtonIsEnabled() {
		return languageOptionDropdownButton.isEnabled();
	}
	public void selectEnglishLanguageOption() {
		Select Language = new Select(languageOptionDropdownButton);
		Language.selectByVisibleText("English");
	}
	public void selectEspanolLanguageOption() {
		Select Language = new Select(languageOptionDropdownButton);
		Language.selectByIndex(5);;
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
	public void clickSignupButton() {
		signupButton.click();
	}
	public boolean signupButtonIsDisplayed() {
		return signupButton.isDisplayed();
	}
	public boolean signupButtonIsEnabled() {
		return signupButton.isEnabled();
	}
	
	
	

}
