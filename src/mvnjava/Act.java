 package mvnjava;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Act {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//Invokes the browser
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		//*[@id="content"]/iframe #content > iframe //*[@id="content"]/iframe
		Thread.sleep(1000);
		driver.findElement(By.id("draggable")).click();
		
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		a.click(source).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//*[@id=\"sidebar\"]//a)[5]")).click();
		
		//driver.quit(); 
		
		
	}

}
