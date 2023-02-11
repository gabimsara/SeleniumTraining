package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobtn {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("https://www.singaporeair.com/en_UK/sg/home?ds_rl=1245134&ds_rl=1245134&gclid=EAIaIQobChMI6PHdraDQ_AIVyplmAh1yvQbuEAAYASAAEgJUvfD_BwE&gclsrc=aw.ds#/book/bookflight");
			driver.manage().window().maximize();
			
			WebElement radiobtn=driver.findElement(By.id("bookFlights"));
			WebElement radiobtn2=driver.findElement(By.id("redeemFlights"));
//			radiobtn.click();
			radiobtn2.click();
	        System.out.println(radiobtn.isSelected());
	        System.out.println(radiobtn2.isSelected());
			
	        System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());

		
		
	 
		
		
	}

}
