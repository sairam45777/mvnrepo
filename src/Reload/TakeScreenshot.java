package Reload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {
 
	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.nopcommerce.com/");

//full screenshot
TakesScreenshot shot=(TakesScreenshot)driver;
File source=shot.getScreenshotAs(OutputType.FILE);
File target=new File(System.getProperty("user.dir")+"\\screenshots77\\fullpage.jpg");
//source.renameTo(target);
FileUtils.copyFile(source, target);

//specific screenshot
WebElement specificscreenshot=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
File source2=specificscreenshot.getScreenshotAs(OutputType.FILE);
File target2=new File(System.getProperty("user.dir")+"\\screenshots\\specific7.png");
source2.renameTo(target2);

WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
File source1=logo.getScreenshotAs(OutputType.FILE);
File target1=new File(System.getProperty("user.dir")+"\\screenshots\\element.png");
source.renameTo(target);

	}

}
