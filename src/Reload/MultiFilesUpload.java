package Reload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiFilesUpload {

	public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.get("https://devidwalsh.name/demo/multiple-file-upload.php");
String file1="c:\\automation\\automationfile\\text1.txt";
String file2="c:\\automation\\automationfile\\text2.txt";
driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1,file2);

int sizeoffiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
//validate numbers of files
if(sizeoffiles==2) {
	System.out.println("all files are uploaded");
}
else
	System.out.println("files not uploaded");
//validate file names
if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Test1.txt")
		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text2.txt"))
{
	System.out.println(" file names matching");
}
else
	System.out.println(" file are not matching");



	}

}
