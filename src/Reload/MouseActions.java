package Reload;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://demo-opencart.com/");
driver.manage().window().maximize();
WebElement desktop=driver.findElement(By.xpath("//a[text()='Desktops']"));
WebElement mac=driver.findElement(By.xpath("//a[@class='nav-link' and text()='Mac (2)']"));
WebElement pac=driver.findElement(By.xpath("//a[@class='nav-link' and text()='PC (0)']"));
Actions action =new Actions(driver);
//action.moveToElement(desktop).moveToElement(mac).click().build().perform();
action.moveToElement(desktop).build().perform();
action.contextClick(desktop);

action.moveToElement(pac).click().build().perform();
action.doubleClick(pac);
//build is create action
//perform is complete action       

//action.moveToElement(mac).doubleClick();
	}

}
 