package javascriptsss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutSendkeys {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
//without sendkeys method
js.executeScript("arguments[0].setAttribute('value','jhon')",inputbox);
js.executeScript("arguments[0].value='sai'", email); 

//inputbox variable store in argument[0]...its an array ..its a predefine array in javascriptexecutor
	
//click method using js
WebElement button=driver.findElement(By.xpath("//input[@class='form-check-input' and @id='friday']"));
js.executeScript("arguments[0].click()",button);
WebElement element=driver.findElement(By.xpath("//textarea[@class='form-control']"));
js.executeScript("arguments[0].setAttribute('style','background:red;border:2px solid blue');",element );
System.out.println("done");

	}

}
