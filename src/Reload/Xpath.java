package Reload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// control+shift+o
public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo-opencart.com/");
//x-path with multiple attributes
//both will currect it will execute
//1st model using AND Operator 
driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("sai");
//second model
driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("sai");
//OR operator  one will be success  in both  of them its executed
driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("sai");

//x-path using inner text
driver.findElement(By.xpath("//*[text()='MacBook']")).click();

//x-pathy with contains ...we pass partial value its beginning or ending
driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]"));

//x-path with end with
driver.findElement(By.xpath("//input[contains(@placeholder,'ch')]"));
//x-path with start  withhttps://demo-opencart.com

driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]"));

//chained x path
boolean img=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
System.out.println(img);

//driver.close(); ram
	}

}
