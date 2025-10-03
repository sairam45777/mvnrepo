package newThinks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class property {
@Test
public void test() throws IOException {
	Proxy pp=new Proxy();
	pp.setHttpProxy("192.168.100.102");
	ChromeOptions option=new ChromeOptions();
	option.setProxy(pp);
	Properties prop=new Properties();
	File file=new File(".\\target\\testdata.properties");
	FileInputStream stream=new FileInputStream(file);
	prop.load(stream);
	System.out.println(prop.getProperty("firstname")); 
	System.out.println(prop.getProperty("lastname"));
	System.out.println((prop.getProperty("browser")));
	System.out.println(prop.getProperty("url"));
}
}
