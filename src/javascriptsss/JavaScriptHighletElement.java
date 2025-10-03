package javascriptsss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptHighletElement {
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
driver.get("https://learn.letskodeit.com/p/practice");
 WebElement element = driver.findElement(By.xpath("//h1[text()='Practice Page is moved to']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].setAttribute('value', 'sai')",element);
js.executeScript("arguments[0].setAttribute('style','background: red; border: 2px solid blue');", element);
//js.executeScript("window.scrollBy(0,500)");
//js.executeScript("arguments[0].ScrollIntoView()", element);


	}

}
