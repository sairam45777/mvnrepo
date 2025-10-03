package mvnjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ScreenShot {

	
		public static void main(String[] args) throws  IOException {
			// TODO Auto-generated method stub
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\saina\\Downloads\\chromedriver2024\\chromedriver-win64\\chromedriver.exe");
			//Invokes the browser C:\Users\saina\Documents\Drivers
			//String filePath = System.getProperty("user.dir")+"\\src";
			WebDriver driver =  new ChromeDriver();

			driver.manage().window().maximize();
			//Pass the URL
			driver.get("https://www.target.com/");
		
//		File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File(filePath+"//test.jpg"));
       TakesScreenshot shot =(TakesScreenshot)driver;
		File src=shot.getScreenshotAs(OutputType.FILE);
		File source=new File(System.getProperty("user.dir")+"\\screenshot\\ssscreen77.jpg");
		//File source=new File("c:\\screenshot\\shote.png");
		FileUtils.copyFile(src, source);  
		
		driver.close();
	}

}
