package newThinks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toggleswitch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_switch.asp");
		WebElement element=driver.findElement(By.xpath("(//div[@class='slider'])[1]"));
		element.click();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid blue')",element);
		Thread.sleep(2000);
		//driver.quit();

		
	}

}
