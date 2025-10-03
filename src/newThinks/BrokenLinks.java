package newThinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

			List<WebElement> links = driver.findElements(By.tagName("a"));
			int numberofBrokenlinks=0;
			int numberofvalidlinks=0;

			for(WebElement link:links) {
				String url=link.getAttribute("href");
				link.getSize();
				if(url==null ||url.isEmpty()) {
					System.out.println("url is empty");
				}
				
					HttpURLConnection hc = (HttpURLConnection)(new URL(url).openConnection());
				//url manaki string formate lo vundhi we convert into url formate by using... url url=new url
				//open one connection for url
					hc.connect();
					//url ki connect chesam
				if(hc.getResponseCode()>=400) {
					System.out.println(url+"broken");
					numberofBrokenlinks++;//broken links counting

					//System.out.println(numberofvalidlinks);
				}
				else {
					System.out.println(url+"is valid");
					url=url+url;
					System.out.println(url);
					numberofvalidlinks++;
				}
		
			}
			System.out.println("xxx "+numberofvalidlinks++);

			System.out.println("yyyy  "+numberofBrokenlinks++);
			driver.quit();
	}

}
