package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public static WebDriver driver;
	public ChromeOptions ops;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\okeog\\OneDrive\\Documents\\Nero Eclipse\\chatdaddy.tech\\drivers\\chromedriver.exe");
		ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		ops.setBinary("C:\\Users\\okeog\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		driver = new ChromeDriver(ops);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://app.chatdaddy.tech/");
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	

}
