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

public class rezisable {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		            //    How to rezise

//			driver.get("https://jqueryui.com/resizable/");
//			driver.manage().window().maximize();
//			 WebElement frame =driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
//			 driver.switchTo().frame(frame);
//			
//			 
//			WebElement resize=  driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
//			  
//			  Actions action = new Actions(driver);
//			  action.dragAndDropBy(resize, 300, 100).perform();
			 
			 
			
               //		How to automateSlider 
		 
		 
//	    	 driver.get("https://jqueryui.com/slider/#colorpicker");
//       		 driver.manage().window().maximize();
//		     WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		     driver.switchTo().frame(frame);
//			
//			 
//			WebElement redslider=  driver.findElement(By.xpath("//*[@id=\"red\"]/span"));
//			  
//		    Actions action = new Actions(driver);
//		    action.dragAndDropBy(redslider, -248,82).perform();
//		
//		
//		   WebElement blueslider=  driver.findElement(By.xpath("//*[@id=\"blue\"]/span"));
//		   Actions action1 = new Actions(driver);
//	       action1.dragAndDropBy(blueslider, 305,176).perform();
	       
	       
	       // How to right Click (Context click)
	       
	       
	       driver.get("https://jqueryui.com/slider/#colorpicker");
     		 driver.manage().window().maximize();
		     WebElement frame =driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		     driver.switchTo().frame(frame);
			
			 
			WebElement contextclick=  driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
			  
		    Actions action = new Actions(driver);
		    action.contextClick(contextclick).perform();
	 
		
		
	}

}
