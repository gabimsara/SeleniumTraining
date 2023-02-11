package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.edge.driver", "D:\\eclipseworkspace\\BrowserDrivers\\msedgedriver.exe");
		 WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");

	}

}
