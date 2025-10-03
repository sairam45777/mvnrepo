package practice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LOCATORS { 

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebElement fb = driver.findElement(By.id("email"));
WebElement fbp = driver.findElement(RelativeLocator.with(By.tagName("div")).below(fb));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].setAttribute('style','background: blue; border: 2px red;')",fb);
js.executeScript("arguments[0].setAttribute('style','background: red; border: 2px blue')",fbp);
 
//driver.quit();
	}

}
