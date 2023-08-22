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
	public void clickSignupButton() {
		signupButton.click();
	}
	
	
	

}
