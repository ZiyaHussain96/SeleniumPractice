package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hr.qa.util.TestUtil;

public class TestBase extends TestUtil
{
	public static Properties prop;
	public static WebDriver driver; 
	
	
	public TestBase()
	{
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\10667670\\eclipse-workspace\\OrangeHRMTest\\src\\main\\java\\com\\hrm\\qa\\config\\config.properties");			
			prop=new Properties();
			prop.load(fis);			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch( IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
		public  void intialization()
		{
			
			if(prop.getProperty("browser").equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Temp\\Selenium\\WebdriverChrom\\chromedriver_2.exe" );
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equals("FF"))
			{
				System.setProperty("webdriver.Firefox.driver","C:\\Temp\\Selenium\\WebdriverChrom\\Firefox.exe" );
				driver = new FirefoxDriver();
			}
			
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(Page_Timeout, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(Implicit_Wait, TimeUnit.SECONDS);
				
				driver.get(prop.getProperty("url"));
		}
		
		
	}
	
	
