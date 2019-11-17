package Selenium.basic.start;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks {
	public static WebDriver driver;
	public static WebElement ele;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
        //ChromeOptions opt= new ChromeOptions();
        //opt.addArguments("--disable-notifications");
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	    //driver.get("https://www.orangehrm.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   /* driver.findElement(By.name("userName")).sendKeys("tutorial2");
		driver.findElement(By.name("password")).sendKeys("tutorial2");
		driver.findElement(By.name("login")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   */ List<WebElement> links=driver.findElements(By.tagName("a"));
  	    System.out.println(links.size());
	    int size=links.size();
	    String s="";
	    String[] link=new String[size]; 
	    int y=0;
	    for(WebElement e:links)
	    {
	    	 s=e.getText();
	    	 link[y]=s;
	    	 y++;
	    }
	    for(int i=0;i<link.length;i++)
	    {
	     ele=driver.findElement(By.linkText(link[i])); 
	     //Thread.sleep(2000);
	     String linkname=ele.getText();
	     //String linkname=driver.findElement(By.linkText(link[i])).getText();
	     ele.click();
	     //String linkNme=ele.getText();
	     //System.out.println(linkNme);
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     String title=driver.getTitle();
	     if(title.contains("404") || (title.contains("page under construction")))
	     {
	    	 System.out.println(linkname+" :---link not working");
	     }
	     else{
	    	 System.out.println(linkname+" :-----link is working");
	     }
	     driver.navigate().back();
	    // Thread.sleep(5000);
	}
    }
}
