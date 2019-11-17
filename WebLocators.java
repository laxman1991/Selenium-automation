package Selenium.basic.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLocators {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	    String title=driver.getTitle();
	    System.out.println("titleof webpage =="+title);
	   //copyright check:
	    String message=driver.getPageSource();
	    if(message.contains("© 2005, Mercury Interactive "))
	    {
	    	System.out.println("copyright exist");
	    }else
	    {
	    	System.out.println("copyright does not exist");
	    }
	    //click on registre link.
	    WebElement e= driver.findElement(By.linkText("REGISTER"));
	    e.click();
	    //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    String regTitlr=driver.getTitle();
		System.out.println("Register page title =="+regTitlr);
		//driver.close();
	}
}
