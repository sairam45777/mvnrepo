package Reload;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumDEMO{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
WebElement arg=	driver.findElement(By.xpath(""));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('').value='sai'", arg);
		js.executeScript("arguments[0].setAttribute('value','sai')",arg);
		js.executeScript("arguments[0].value='sai'",arg);
		js.executeScript("arguments[0].click()", arg);
		js.executeScript("argumenets[0].setAttribute('style','background:red;border:2px solid blue');", arg);
		js.executeScript("window.scrollBy(0,500)", arg);
		js.executeScript("arguments[0].scrollIntoView()", arg);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("return window.pageYOffSet");
		js.executeScript("argumenets[0].setAttribute('value','sai');", arg);
		js.executeScript("arguments[0].value='sai'", arg);
	/*controlfocus("controlkId",comment,"constantId")
	 * controlSetText("controlId","path","comment",constaneId")
	 * controlClick("controlId","comment","constantId")*/
		//js.executeScript("arguments[0].setAttribute('value','sai')",source);
	//	js.executeScript("arguments[0].value='sqai')", source);
		/* highlet
		 * click
		 * scrollby
		 * scrollintoview
		 * hiddenElement
		 * withoutSendKeys*/
	
	}
}
