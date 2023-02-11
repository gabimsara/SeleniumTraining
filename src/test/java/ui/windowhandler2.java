package ui;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandler2 {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

		 driver.get("https://store.steampowered.com/login/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[7]/a[3]")).click();
			Set<String> windowshandle =driver.getWindowHandles();       //meka krnne next window ekata yadi eka para windowset ekak gnna puluvan hinda meka SET string ekakata dagatthama iterator krla ona thram windows select krnna puluvan
			System.out.println(windowshandle);
			
			 Iterator<String> iterator= windowshandle.iterator();
			 String parentwindow = iterator.next();
			 
			 String childwindow =iterator.next();
			
			 
	 
			 
			 driver.switchTo().window(childwindow);
			 Thread.sleep(4000);
			
			driver.switchTo().window(parentwindow);
			driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[7]/a[2]")).click();
			 String thirdwindow = iterator.next();
			driver.switchTo().window(thirdwindow);
			driver.switchTo().window(parentwindow);
			
		
		
	 
		
		
	}

}
