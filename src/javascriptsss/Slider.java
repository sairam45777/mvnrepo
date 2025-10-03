 package javascriptsss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
driver.manage().window().maximize();
//min to max
WebElement min_slider=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));//slider inspect chesam
System.out.println(min_slider.getLocation());
//location of point beacuse its 100 position we moive next 50 its goes 150 but we want onle 50

//System.out.println(min_slider.getLocation().getX());//get x axes individually
//System.out.println(min_slider.getLocation().getY());
Actions action=new Actions(driver);
action.dragAndDropBy(min_slider, 100, 0).perform();//x axes moveing y axes zero( 58,249)
System.out.println(min_slider.getLocation());//(157,249

// max to min
WebElement max=driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
System.out.println(max.getLocation());//(876,249)

action.dragAndDropBy(max, -100, 0);//(778,249)
System.out.println(max.getLocation());
//driver.quit();

	}

}
