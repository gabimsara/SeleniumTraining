package ui;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicWebDriverMethods {

	public static String browser = "firefox";
	public static WebDriver driver;
	

	public static void main(String[] args) {

		
			
			if (browser.equals("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (browser.equals("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

			}

			driver.get("http://www.saucedemo.com");
			driver.manage().window().maximize();
			//String currentUrl= driver.getCurrentUrl();
			//System.out.println(currentUrl);
			
			//String title= driver.getTitle();
			//System.out.println(title);
			
			//String source=driver.getPageSource();
			//System.out.println(source);
			
			//driver.navigate().to("https://www.youtube.com/watch?v=DyMcEs6EWEQ&list=PLL34mf651faPB-LyEP0-a7Avp_RHO0Lsm&index=33");
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
		   List<WebElement> webelements=driver.findElements(By.xpath("//div[@class='inventory_list']"));
			System.out.println(webelements);
			
//			driver.navigate().to("https://store.steampowered.com/");
//			String windowHandle = driver.getWindowHandle();
//			System.out.println(windowHandle);
			
			driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[1]/div/div[3]/div/a")).click();
			driver.getWindowHandles();
			Set<String> windowhandles=driver.getWindowHandles();
			System.out.println(windowhandles);
			
			
			
			
		    driver.close();
		  
		
	 
		
		
	}

}
