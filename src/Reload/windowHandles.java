package Reload;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  windowHandles {
	
public static void main(String []args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//single window handle
	//String windowId=driver.getWindowHandle();.......// its returns new Id value every time
	//System.out.println(windowId);
	//WebElement path = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
	Thread.sleep(5000);

	WebElement path = driver.findElement(By.linkText("OrangeHRM, Inc"));

	path.click();
	//its gives multiple windowIds
	Set<String> handles=driver.getWindowHandles();
	//set method can't have get method thats why we convert it into list method
	//approach 1
List<String>windowlist=new ArrayList(handles);
//List<String>handles=new ArrayList();

	//list collection we can extract individual items
	String parantid=windowlist.get(0);
	String childid=windowlist.get(1);
	System.out.println(driver.getTitle());//its display parent title because driver is still focused parent window only
	//switch to child window
	driver.switchTo().window(childid);
	System.out.println(driver.getTitle());
	//switch to parent window
	driver.switchTo().window(parantid);
	System.out.println(driver.getTitle());
	//approach 2
	for(String winId:handles) {
		String title=driver.switchTo().window(winId).getTitle();
		//optional
		if(title.equals("OrangeHRM")) {
			System.out.println(driver.getCurrentUrl());
		}
	}
	
	
	
	
	
	
	
	
}
}
