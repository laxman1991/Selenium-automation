package Selenium.basic.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExamples {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().refresh();
	driver.manage().window().maximize();
    String title=driver.getTitle();
    System.out.println("title=="+title);
    String source=driver.getPageSource();
    System.out.println("source=="+source);
    driver.navigate().back();
    driver.navigate().forward();
    driver.quit();
    //how to creatae webelement
    
    WebElement userName=driver.findElement(By.name(""));
               userName.sendKeys("");
           String text=userName.getText();    
               
	} 
}
