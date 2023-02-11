package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handlingautosuggestdropdown {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");
			driver.manage().window().maximize();
//			driver.findElement(By.xpath("//div[@class='hsBackDrop']")).click();
			driver.findElement(By.xpath("//span[text()='From']")).click();
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			
//			WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
//			from.sendKeys("Sydney");
//			from.sendKeys(Keys.ARROW_DOWN);
//			from.sendKeys(Keys.ENTER);                   mehema webelement ehekata dala eken apita call krnnath puluvn 
		
	        	
	        	
	        }
			

		
		
	 
		
		
	}


