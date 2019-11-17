package com.configuation;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	
	public  static WebDriver browser_Start(WebDriver driver,String url)
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
	public static void screen_Shot(WebDriver driver) throws IOException
	{
	   	TakesScreenshot screenshot=(TakesScreenshot)driver;
	   	File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
	   	File destFile=new File("D://Screenshot//test.png");
	   	FileUtils.copyFile(srcFile, destFile);
	}
}



