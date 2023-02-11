package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxandradio {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();

			driver.get("https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header");
			driver.manage().window().maximize();
			
			 WebElement radiobtn = driver.findElement(By.id("footer"));        //pahalata scroll vena eka
			 Actions actions = new Actions(driver);
			 actions.moveToElement(radiobtn);
			 actions.perform();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/div[1]")).click();
			
			
			System.out.println(driver.findElements(By.xpath("//*[@id=\"responsive_page_template_content\"]/div/div[1]/div/div/div/div[2]/div/form/div[3]/div[1]")).size()); //checkbox keeyak thyenvda kyala balana eka
			
	       
			

		
		
	 
		
		
	}

}
