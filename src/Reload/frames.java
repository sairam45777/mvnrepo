package Reload;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		WebElement firstbox=driver.findElement(By.xpath("//input[@name='mytext1']"));// after switching to fram its inside offrame 1
		firstbox.sendKeys("sai");
		//its comback to the main page																		//its con't move another fram ...we move back to perform
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		//frame2
		WebElement fram2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(fram2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("ram");
Thread.sleep(1000);
		//its comback to the main page																		//its con't move another fram ...we move back to perform
				driver.switchTo().defaultContent();
				driver.switchTo().frame(frame1);
				firstbox.sendKeys("ram dodda");
				
		driver.switchTo().defaultContent();
		WebElement fram3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(fram3);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("dodda");


	}

}
