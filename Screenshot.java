package Selenium.basic.start;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
		 driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //driver.findElement(By.xpath("/html/body/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
		 //login.sendKeys("laxman");
		 
		 driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
		 // password.sendKeys("more");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         //driver.findElement(By.xpath("/html/body/input")).click();
         
         driver.findElement(By.xpath("//*[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("laxman");
         //login.sendKeys("laxman");
         
         driver.findElement(By.xpath("//*[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("mmore");;
        // password.sendKeys("more");
         
         driver.findElement(By.xpath("//*[@id='VALIDATE_CREDENTIALS1']")).click();
         //sign.click();
         Thread.sleep(10000);
         TakesScreenshot screnshot=((TakesScreenshot)driver);
         File  src=  screnshot.getScreenshotAs(OutputType.FILE);
          File desc=new File("D:\\Screenshotabc\\abc.png");
         FileUtils.copyFile(src,desc);
        
	}
}
