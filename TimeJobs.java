package Selenium.basic.start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class TimeJobs {
	    public static WebElement skill;
		public static WebElement location;
		public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 
		
		 System.setProperty("webdriver.chrome.driver","D://JarfilesandLibraryanddrivers//chromedriver_win32//chromedriver//chromedriver.exe");
		 ChromeOptions opt= new ChromeOptions();
	     opt.addArguments("--disable-notifications");
		 driver= new ChromeDriver(opt);
         driver.manage().window().maximize();
         driver.get("https://www.timesjobs.com/");
		 Thread.sleep(5000);
		 
		  /* driver.findElement(By.name("txtKeywords")).sendKeys("sofware tester");
		  //skill.sendKeys("Software");
		  driver.findElement(By.id("txtLocation")).sendKeys("Gurgaon");;
		 // location.sendKeys();
		  Select select; 
		  select= new Select(driver.findElement(By.id("cboWorkExp1")));
		  select.selectByVisibleText("5 years");
		  driver.findElement(By.xpath("//*[@id='quickSearchBean']/button")).click();
		  WebElement jobcount=driver.findElement(By.id("totolResultCountsId"));
	      System.out.println("Job Count is "+jobcount.getText());
	    */  
         
        WebElement ele= driver.findElement(By.xpath("//*[@id='site']/header/div[2]/ul/li[3]/a"));
        ele.click();	
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='jobfuncDiv']/fieldset[1]/div/div/div[1]/button")).click();
        driver.findElement(By.xpath("//*[@id='funcAreaMultiId']/div/div/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='funcAreaMultiId']/div/div/input")).sendKeys("acc");
        WebElement d=driver.findElement(By.xpath("//*[@id='funcAreaMultiId']/div/div/input"));
        //take list of list element
       List<WebElement> list=driver.findElements(By.tagName("li"));
       for(WebElement content:list)
       {
    	String data=content.getText();
    	if(data.contains("Accounting/Tax/Company"))
    	{
    		content.click();
    	}
       }
	}
}
