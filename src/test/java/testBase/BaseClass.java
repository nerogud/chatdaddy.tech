package testBase;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public ChromeOptions ops;
	public ResourceBundle resourcebundle;
	
	@BeforeClass
	public void setup() {
		resourcebundle= ResourceBundle.getBundle("config");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\okeog\\OneDrive\\Documents\\Nero Eclipse\\chatdaddy.tech\\drivers\\chromedriver.exe");
		ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.setBinary("C:\\Users\\okeog\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(resourcebundle.getString("url"));
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	public String getRandomString() {
		return RandomStringUtils.randomAlphabetic(7);
	}
	public String getRandomNumbers() {
		return RandomStringUtils.randomNumeric(7);
	}
	

}
