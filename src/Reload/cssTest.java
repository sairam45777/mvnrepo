package Reload;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
public class cssTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://demo.nopcommerce.com/");
 
driver.manage().window().maximize();
//tag id-tag#id
//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");

//tag class-tag.classname
driver.findElement(By.cssSelector("input.search-box-text")).clear();
//tag attribute
driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("sai");
//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("sai");
//double quttesion(" ") use chesam kabatti \ use chesam

//tag class and attribute
driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("tshirt");
//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("tshirt");


	}

	@AfterMethod
	public void test() {
		
	}
}
