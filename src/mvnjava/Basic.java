package mvnjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.out.println("Hello World");
//ChromeDriver Property
System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");

//Invokes the browser
WebDriver driver =  new ChromeDriver();

driver.manage().window().maximize();
//Pass the URL
driver.get("https://www.saucedemo.com");

String Title=driver.getTitle();

System.out.println(Title);
//Login
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();

//Product list page
driver.findElement(By.xpath("//img[@class='inventory_item_img']")).click();
Thread.sleep(2000);
//driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
Thread.sleep(3000);
driver.findElement(By.className("shopping_cart_badge")).click();
Thread.sleep(2000);

//Checkout
driver.findElement(By.id("checkout")).click();

driver.findElement(By.id("first-name")).sendKeys("sai");
try {
	driver.findElement(By.id("last_name")).sendKeys("123");
} catch (Exception e) {
	// TODO: handle exception
	
	System.out.println(e);
	driver.findElement(By.id("last-name")).sendKeys("123");
}


driver.findElement(By.xpath("//input[@type='text']")).sendKeys("547");
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("react-burger-menu-btn")).click();
//Logout
driver.findElement(By.id("logout_sidebar_link")).click();
 driver.quit();


	}

}
