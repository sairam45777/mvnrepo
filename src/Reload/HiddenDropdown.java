package Reload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//click on drop down elements will visible... but location of elements not visible
//selecterhub lo debugger option click cheste elements location will be visible
public class HiddenDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
	//loginsteps //span[normalize-space()=	'PIM']
	Thread.sleep(2000);
	WebElement admin=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	admin.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']"));
	password.sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	//driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']/i")).click();
	//driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']/i"));)
	// click on pim //span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']
//	driver.findElement(By.xpath("//nav[@class='oxd-navbar-nav']//ul//li[2]")).click();
	WebElement element=driver.findElement(By.xpath("//div[@class='oxd-select-option --selected']/span[text()='Account Assistant']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",element); 
	driver.findElement(By.xpath("//div[@class='oxd-select-option --selected']/span[text()='Account Assistant']"));
	
	/*count number of options //a[@class='oxd-main-menu-item active']
	 List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//spam"));
	System.out.println(options.size());*/
	
	
	


}
}
