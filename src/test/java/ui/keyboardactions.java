package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;



import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardactions {

	public static String browser = "chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {

		
			
			if (browser.equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			 driver.get("https://extendsclass.com/text-compare.html");
             driver.manage().window().maximize();
             WebElement sourcetextarea =driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div//pre/span")); //selesct krla cop krgnna vdaya
             Actions action = new Actions(driver);
             action.keyDown(sourcetextarea,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
             Thread.sleep(2500);
             WebElement targettextarea =driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]//pre/span")); // eha patthe paste wena vdya
             action.keyDown(targettextarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
             
             
            
		
			
			
			
		
		
	 
		
		
	}

}
