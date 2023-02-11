package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;



import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

	public static String browser = "chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) {

		
			
			if (browser.equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			driver.get("http://www.saucedemo.com");
			By usernameLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		
			
			
			
		
		
	 
		
		
	}

}
