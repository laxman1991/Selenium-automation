package Selenium.basic.start;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiesdemo {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver_win32\\chromedriver\\chromedriver.exe");
         WebDriver driver= new ChromeDriver();
         driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");		
          Set set=driver.manage().getCookies();
          System.out.println(set.size());

          driver.manage().deleteAllCookies();
          driver.navigate().refresh();
          driver.manage().addCookie(new Cookie("laxman", "more"));
          
          Iterator atr=set.iterator();
          while(atr.hasNext())
          {
         	 System.out.println(atr.next());
          }
        }
          
	}



