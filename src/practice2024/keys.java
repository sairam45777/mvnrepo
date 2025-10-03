package practice2024;

 import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keys {


	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement email = driver.findElement(By.id("email"));
email.sendKeys("sai");
WebElement password = driver.findElement(RelativeLocator.with(By.tagName("input")).below(email));
password.sendKeys("ram");
	driver.findElement(RelativeLocator.with(By.tagName("button")).below(password)).click();
	//driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy ")).sendKeys(Keys.ENTER);
//driver.quit();
	}

}
