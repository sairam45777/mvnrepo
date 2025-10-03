package practice2024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseEvents {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://tutorialsninja.com/demo/");
WebElement element=driver.findElement(By.name("search"));

Actions action =new Actions(driver);   
action.contextClick(element).build().perform();









	}

}
