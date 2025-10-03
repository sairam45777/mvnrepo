package mvnjava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getsize {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement ele = driver.findElement(By.name("search"));
	Point pp=	ele.getLocation();
		Dimension d = ele.getSize();
		 String si = ele.getCssValue("font-size");
		 List<WebElement>element=driver.findElements(By.xpath(""));
		int size = element.size();
		System.out.println(d.getHeight());
		d.getWidth();
Rectangle rect=ele.getRect();
System.out.println(rect.getHeight());
System.out.println(rect.getWidth());
System.out.println(rect.getX());
System.out.println(rect.getY());

	}

}
