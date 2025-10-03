package newThinks;

import java.awt.AWTException;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class dummy {

	public static void main(String[] args) throws IOException, AWTException {
		DesiredCapabilities dd=new DesiredCapabilities();
		dd.setPlatform(Platform.WINDOWS);
		dd.setBrowserName("Chrome");
		WebDriver driver=new RemoteWebDriver(new URL(""),dd);
		List<WebElement> element=driver.findElements(By.xpath(""));
		String year="";
		String month="";
		while(true) {
			String yeardata=driver.findElement(By.xpath("")).getText();
			String monthdata=driver.findElement(By.xpath("")).getText();
			if(yeardata.equalsIgnoreCase(year)&&monthdata.equalsIgnoreCase(month)) {
				break;
			}
			List<WebElement> dates=driver.findElements(By.xpath(""));
			for(WebElement date:dates) {
			if(date.equals(7)) {
				date.click();
				break;
			}}
		}

		
	}
	}

/*gaikward
 * rachin.....
 * rahane
 * dube...
 * rezi
 * mitchal..
 * dhoni
 * jadeja.....
 * thakur......
 * deepak.......
 * theeksana.....
 * pathiranaa....
 */
 