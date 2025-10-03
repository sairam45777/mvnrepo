package Reload;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsWithoutSwitch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()' and 'Click for JS Confirm']")).click();
	Alert alert=wait.until(ExpectedConditions.alertIsPresent());//capture alert
	alert.accept();

}
}