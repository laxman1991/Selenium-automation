package com.excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ReadExcel {

		public static WebDriver driver;
		public static WebElement user;
		public static WebElement pass;
		public static WebElement login;
		public static void fLogin() throws IOException
		{
			try{
			File f=new File("D://user.xlsx");	
			//String username,password;
		    FileInputStream input = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(input);
		    XSSFSheet sheet=workbook.getSheet("user");
			//String rowData=sheet.getRow(1).getCell(0).getStringCellValue();
			//System.out.println("cell value is :-"+rowData);d
			int row=sheet.getLastRowNum();
			//System.out.println(row);
			//XSSFRow rw=sheet.getRow(row);
			//int col=rw.getLastCellNum();
			//System.out.println(col);
			for(int i=1;i<=row;i++)
		    {
				String username= sheet.getRow(i).getCell(0).getStringCellValue();
				String password= sheet.getRow(i).getCell(1).getStringCellValue();
			//driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys(username);
		    driver.findElement(By.id("pass")).sendKeys(password);
		    login=driver.findElement(By.id("u_0_2"));
		    login.click();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    sheet.getRow(0).createCell(2).setCellValue("Status");
		    
		    FileOutputStream out= new FileOutputStream(f);
		}
		   }
		   catch(Exception e)
			{
				e.printStackTrace();
			}
			finally {
				if(driver!=null)
				{
					//driver.close();
				}
			}
		}
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","D:\\JarfilesandLibraryanddrivers\\chromedriver_win32\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			fLogin();
		}
	}
	


