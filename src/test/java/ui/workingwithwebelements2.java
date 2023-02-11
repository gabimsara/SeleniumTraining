package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class workingwithwebelements2 {

	public static WebDriver driver;
	

	public static void main(String[] args) {

		
			

				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();

			

			driver.get("http://www.sugarcrm.com/au/request-demo/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
			driver.findElement(By.name("email")).sendKeys("aselbimsara@gmail.com");
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("awareness_source_c")).sendKeys("Event");
			System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());
			System.out.println(driver.findElement(By.xpath("//*[@id=\\\"field1\\\"]/div/input")).getLocation());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div/h1")).getText());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
			System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());
//			driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div/div/div/div[1]/form/div/div[2]/div/input")).sendKeys("asel");
			//driver.close();
			
		
		
	 
		
		
	}

}
