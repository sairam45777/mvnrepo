package practice2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/iframe");
WebElement frame = driver.findElement(By.id("mce_0_ifr"));
driver.switchTo().frame(frame);
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame));
driver.findElement(By.id("tinymce")).sendKeys("sairam");
 //driver.quit();

	}

}
