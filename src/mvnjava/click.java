package mvnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class click {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("sai");
WebElement element=driver.findElement(By.id("sai"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].click()",element);
Actions action = new Actions(driver);
action.moveToElement(element).click().build().perform();
	}

}
