package Reload;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingcheckBoxes {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
//first approach....less elements we do this 
driver.findElement(By.xpath("//input[@id='sunday'")).click();
		
//second
List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//list start with zero	
for(int i=0;i<checkboxes.size();i++) {
	checkboxes.get(i).click();
}
//third
for( WebElement box:checkboxes) {
	box.click();
}
//last three...total 7 u want last three
for(int i=4;i<checkboxes.size();i++) {
	checkboxes.get(i).click();
}
//first three
for(int i=0;i<3;i++) {
	checkboxes.get(i).click();
}
//select check boxes unselect
for(int i=0;i<checkboxes.size();i++) {
	if(checkboxes.get(i).isSelected()) {
		checkboxes.get(i).click();
	}
	for(WebElement checkbox:checkboxes) {
		if(checkbox.isSelected()) {
			checkbox.click();
		}
	}
}


	}

}
