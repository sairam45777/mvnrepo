   package practice2024;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandles {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("http://omayo.blogspot.com/");
driver.findElement(By.linkText("Open a popup window")).sendKeys(Keys.ENTER);
String handle=driver.getWindowHandle();//current window its display
Set<String>hanles=driver.getWindowHandles();
//for(String han:hanles) {
//	driver.switchTo().window(han);
//	Thread.sleep(5000);
//}
driver.close();
Thread.sleep(4000);
driver.switchTo().window(handle);
driver.quit();
	}

}
