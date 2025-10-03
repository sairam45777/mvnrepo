package newThinks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class chord {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
   WebElement element=driver.findElement(By.xpath("//div[@id='HTML11']//textarea"));
  WebElement element1= driver.findElement(By.id("ta1"));
element.click();
element.sendKeys(Keys.chord(Keys.CONTROL,"a"));
//two keys perform at a time to select all data 
element1.sendKeys(Keys.chord("a","b","u","n"));
//text area field lo multiable keys ni send cheyyochu
//enter number keys
element1.sendKeys(Keys.NUMPAD1);
element1.sendKeys(Keys.NUMPAD2);
//number ni send cheyyochu
	}
}
