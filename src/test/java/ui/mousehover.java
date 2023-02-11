package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			 WebElement element =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"));
			 Thread.sleep(2500);
			 
			 Actions action = new Actions (driver);
			 action.moveToElement(element).perform();
			 
			 WebElement element2 =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"));
			 Actions action2= new Actions(driver);
			 action.moveToElement(element2).perform();
			
//		   
		
		
		
	 
		
		
	}

}
