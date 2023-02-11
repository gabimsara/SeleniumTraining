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

public class windowhandler {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

			driver.get("https://www.salesforce.com/au/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[text()='Accept All Cookies']//parent::div[@class='banner-actions-container']")).click();
			driver.findElement(By.xpath("//div[@class='buttonCTAComponent parbase section']/div[1]/div[1]/div[1]/a[@href='/au/form/signup/freetrial-sales/?d=jumbo1-btn-ft']")).click();
			
			Thread.sleep(2500);
			
			Set<String> windowshandle =driver.getWindowHandles();       //meka krnne next window ekata yadi eka para windowset ekak gnna puluvan hinda meka SET string ekakata dagatthama iterator krla ona thram windows select krnna puluvan
			System.out.println(windowshandle);
			
			 Iterator<String> iterator= windowshandle.iterator();
			 String parentwindow = iterator.next();
			 
			 String childwindow =iterator.next();
			 
	 
			 
			 driver.switchTo().window(childwindow);
			
			driver.findElement(By.name("UserFirstName")).sendKeys("Asel");
			driver.findElement(By.name("UserLastName")).sendKeys("Bimsara");
//			Thread.sleep(2500);
//			driver.switchTo().window(parentwindow);
			
//			driver.findElement(By.xpath("//*[@id=\"main\"]/div[4]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/a")).click();
//			driver.switchTo().window(thirdwindow);
//			driver.findElement(By.name("UserFirstName")).sendKeys("Asel");
//			driver.findElement(By.name("UserLastName")).sendKeys("Bimsara");
			
		
		
		
	 
		
		
	}

}
