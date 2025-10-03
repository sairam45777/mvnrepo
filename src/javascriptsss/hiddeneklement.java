package javascriptsss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddeneklement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
driver.get("https://learn.letskodeit.com/p/practice");
driver.findElement(By.linkText("https://www.letskodeit.com/practice"));
driver.findElement(By.xpath("//div[@id=\"block-1069048\"]//h1/a")).click();
//driver.findElement(By.xpath("//input[@id='hide-textbox']"));
//driver.findElement(By.id("id=\"show-textbox\""));
//driver.findElement(By.id("hide-textbox"));
//driver.findElement(By.id("displayed-text")).sendKeys("sai");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('displayed-text').value='sai'");
js.executeScript("document.getElementById('hiddenButton').click();");//currectone find it in chatgpt

	
	}

}
