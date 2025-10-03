package Reload;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aletrts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	//normal alert with button ...its only ok button
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	Thread.sleep(5000);
	/*Alert myalert=driver.switchTo().alert();
	System.out.println(myalert.getText());
	myalert.accept();
	
//conformation alert ...its have ok and cancel buttons
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()' and 'Click for JS Confirm']")).click();
	Alert alert=driver.switchTo().alert();
	alert.accept();
	//alert.dismiss();*/
	
	//prompt alert
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()' and 'Click for JS Prompt']")).click();
	Alert alert1=driver.switchTo().alert();
	alert1.sendKeys("welcome");
	alert1.accept();
	
	driver.close();
}
}
