package Reload;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionAndActions {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
Actions action =new Actions(driver);
Action myaction=action.contextClick(button).build();//building or creating an action storing into a variable
myaction.perform();//we are perform or compliting action

	}

}
 