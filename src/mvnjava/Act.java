package mvnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");

		//Invokes the browser
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
		//*[@id="content"]/iframe #content > iframe //*[@id="content"]/iframe
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//*[@id=\"sidebar\"]//a)[5]")).click();
		
		
		
		
	}

}
