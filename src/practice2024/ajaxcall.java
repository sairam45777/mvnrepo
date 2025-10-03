package practice2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ajaxcall {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://omayo.blogspot.com/");

driver.findElement(By.className("dropbtn")).click();
WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(300));
WebElement facebook = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
 facebook.click();
 Thread.sleep(1000);
driver.quit();
	}

}
