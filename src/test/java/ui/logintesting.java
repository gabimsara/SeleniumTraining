package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintesting {

	public static String browser = "firefox";
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
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			driver.close();
			
		
		
	 
		
		
	}

}
