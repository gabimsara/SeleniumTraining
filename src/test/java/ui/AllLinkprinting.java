package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinkprinting {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("http://www.sugarcrm.com/au/request-demo/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
	        List<WebElement> alltags = driver.findElements(By.tagName("a"));
	        System.out.println(alltags.size());
	        
	        for(int i=0;i<alltags.size();i++)
	        {
	        	
	        	System.out.println(alltags.get(i).getAttribute("href"));
	        	System.out.println(alltags.get(i).getText());
	        	
	        	
	        	
	        }
			

		
		
	 
		
		
	}

}
