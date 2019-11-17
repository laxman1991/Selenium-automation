package Selenium.basic.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {
	
	public static WebDriver driver;
	public static WebDriver ele;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
        //ChromeOptions opt= new ChromeOptions();
       // opt.addArguments("--disable-notifications");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	    //driver.get("https://www.orangehrm.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    List<WebElement> linkCollect=driver.findElements(By.tagName("a"));
	    
	    /*for(WebElement ele:linkCollect)
	    {
	    	String s=ele.getText();
	    	//System.out.println(s);
	    }*/
	    
	    String testLink[]=new String[linkCollect.size()];
	    int i=0;
	    String copyLink=" ";
	   	for(int j=0;j<linkCollect.size();j++)
	    	{
	    	copyLink=linkCollect.get(j).getText();
	    	testLink[i]=copyLink;
	    	i++;
	    	}
	   	 for(int k=0;k<testLink.length;k++)
	   			 {
	   		 WebElement ele=driver.findElement(By.linkText(testLink[k]));
	   		WebElement link= driver.findElement(By.linkText(testLink[k]));
	   		String linkName=link.getText();
	   		ele.click();
	    	String title=driver.getTitle();
	    	if(title.contains("404") || title.contains("page not found") || title.contains("page under construction")) 
	    			{
	    		     System.out.println(linkName+" :-----not working");
	    			}
	    	else{
	    		System.out.println(linkName+" :-----link is working");
	    	}
	    	driver.navigate().back();
	    }
	 	}
}
