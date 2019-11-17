package Selenium.basic.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.chromeop
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Redbus {
	private static final boolean WebElement = false;
	private static WebElement Ondate;
	private static WebElement ret;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
	    driver.get("https://www.redbus.in/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement source=driver.findElement(By.id("src"));
	    source.sendKeys("mumbai");
        WebElement sourcelist=driver.findElement(By.xpath("//*[@id='search']/div/div[1]/div/ul"));
	    List<WebElement> li=sourcelist.findElements(By.tagName("li"));
        
        for(WebElement ele:li)	
        {
        String s=ele.getText();
       // System.out.println(s);
           if(s.equals("mumbai"));
           {
        	   ele.click();
        	   break;
           }
        }
    //bangalore select
       WebDriverWait wait= new WebDriverWait(driver,120);
       WebElement dest= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='dest']")));
       dest.sendKeys("Bang");
      WebElement destList= driver.findElement(By.xpath("//*[@id='search']/div/div[2]/div/ul"));
        List<WebElement> li1=destList.findElements(By.tagName("li"));
        
        for(WebElement ele1:li1)
        {
        String s1=ele1.getText();
           Thread.sleep(1000);
           if(s1.equals("Bangarupalem"));
           {
        	   ele1.click();
        	   break;
           }
        }
        Thread.sleep(8000);
       //onward date calender handle
        WebElement element=driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label"));
            Thread.sleep(1000);
            element.click();	
            WebDriverWait w1 = new WebDriverWait(driver,120);
            try{
            Ondate=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rb-calendar_onward_cal']/table")));
            }
            catch (Exception e) {
				System.out.println(e); 
			}
      List<WebElement> cal=Ondate.findElements(By.tagName("td"));
        for(WebElement onward:cal)
        {
        String ca=onward.getText();
           if(ca.equals("3"));
           {
        	   onward.click();
        	   break;
           }
        }
     //return date
		WebElement returnn =driver.findElement(By.xpath("//*[@id='search']/div/div[4]/div/label"));
		returnn.click();
		WebDriverWait w2 = new WebDriverWait(driver,120);
		
		try
		{
		ret=w2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rb-calendar_return_cal']/table")));
		}
		catch(Exception x)
		{
			System.out.println(x.toString());
		}
		
        List<WebElement> retDate =ret.findElements(By.tagName("td"));
		
		for(WebElement d:retDate)
		{
			String s = d.getText();
			if (s.equals("30"))
			{
				d.click();
				break;
			}
		}
	    Thread.sleep(50000);
 	driver.findElement(By.id("search_btn")).click();
	}
}
