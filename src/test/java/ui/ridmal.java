package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ridmal {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			WebElement ridmal =driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[2]/div[14]"));
			ridmal.sendKeys(Keys.ENTER);
//		   
		
		
		
	 
		
		
	}

}
