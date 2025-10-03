package javascriptsss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptalert {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
WebElement test=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
test.click();
Alert alert=driver.switchTo().alert();
//Alerts al=new Alerts();
System.out.println(alert.getText());
alert.accept();
driver.quit();
}
}