package com.configuation;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class System_Properties {
	
	public static WebDriver browser_Start(WebDriver driver,String url)
	{
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver= new ChromeDriver(opt);
		driver.get(url);
		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	}
}



