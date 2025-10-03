package javascriptsss;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	
		public static void main(String[] args) throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Documents\\Drivers\\chromedriver.exe");
			//Invokes the browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver =  new ChromeDriver();

			driver.manage().window().maximize();
			//Pass the URL
			driver.get("https://www.target.com/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			Thread.sleep(2000);
			
		//	js.executeScript("window.scrollBy(0,900)");
		//	System.out.println(js.executeScript("return window.pageYOffset"));//y axes a pixele daggara agindho display chestadi
			//js.executeScript("arguments[0].scrollIntoView",element);
			
			//ending of the page
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.pageYOffset"));//y axes a pixele daggara agindho display chestadi

			//intial point
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.pageYOffset"));//y axes a pixele daggara agindho display chestadi

			//horigentle moving
			js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
			System.out.println(js.executeScript("return window.pageYOffset"));//y axes a pixele daggara agindho display chestadi

			
			
			
			
	}

}
