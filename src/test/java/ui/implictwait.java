package ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implictwait {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			
			 WebElement element =driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
			 driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES); //meken force krnne nathuva thread.sleep vage eta wada normally hdata krnna puluvn  //1 min kyanne maxma timeout eka ikmnata enne hynna pulvn vena hinda
			 
			 Actions action = new Actions (driver);
			 action.moveToElement(element).perform();
			 
			 driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
			
			 
			 
			
//		   
		
		
		
	 
		
		
	}

}
