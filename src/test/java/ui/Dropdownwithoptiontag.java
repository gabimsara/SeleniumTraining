package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwithoptiontag {

	public static WebDriver driver;
	

	public static void main(String[] args) throws Throwable {

		
			

				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();

			

					driver.get("http://www.sugarcrm.com/au/request-demo/");
//				    driver.get("http://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
					driver.manage().window().maximize();
					driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[2]/button[4]")).click();
					WebElement dropdown= driver.findElement(By.name("employees_c"));
					
					Select select = new Select(dropdown);
					WebElement dddownn=select.getFirstSelectedOption();
					System.out.println(dddownn.getTagName());
					
					select.selectByVisibleText("11 - 50 employees");
					select.selectByValue("level3");
					select.selectByIndex(4);  //me kyanne arrays vala vage 0n patan gatthama kyana eka

					
//                    WebElement dropdown= driver.findElement(By.id("multi-select"));
//					Select select = new Select(dropdown);
//					select.selectByValue("California");
//					Thread.sleep(2000);
//					select.selectByIndex(5);
//					Thread.sleep(2000);
//					List<WebElement> getslectitems=select.getAllSelectedOptions();
//					System.out.println(getslectitems.size());
//					select.deselectAll();
//					Thread.sleep(2000);
//					select.selectByValue("alifornia");
//					Thread.sleep(2000);
//					select.selectByIndex(5);
//					Thread.sleep(2000);
//					select.deselectByValue("California");
//					Thread.sleep(2000);
//					List<WebElement> getslectitems1=select.getAllSelectedOptions();
//					System.out.println(getslectitems1.size());
//					
				         
				 
		
		
	 
		
		
	}

}
