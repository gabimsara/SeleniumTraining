package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();

////			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//			
//			driver.manage().window().maximize();
//			WebElement frame1 = driver.findElement(By.id("iframeResult")); //meka one wenne frame eka webelement frame ekaknm vithry
//			driver.switchTo().frame(frame1);
////			driver.switchTo().frame(1); // 1kyana eken kynne keeveni frame eka yatatheda meka thyenne kyala
////			driver.switchTo().frame("iframeResult");
//			driver.findElement(By.xpath("/html/body/button")).click();
//			String alret =driver.switchTo().alert().getText();
//			System.out.println(alret);
//			driver.switchTo().alert().accept();
////	    driver.switchTo().alert().dismiss();
//			driver.switchTo().parentFrame();
//			System.out.println(driver.getTitle());
			
			
		 //alret box ekakata keys send krnvnm mehema krnne
		 
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
			driver.manage().window().maximize();
			WebElement frame1 = driver.findElement(By.id("iframeResult")); 
     		driver.switchTo().frame(frame1);
     		driver.findElement(By.xpath("/html/body/button")).click();
     		driver.switchTo().alert().sendKeys("Asel Bimsara");
     		driver.switchTo().alert().accept();
     		

		
		
	 
		
		
	}

}
