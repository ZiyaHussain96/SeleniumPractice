package Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseClass 
{	
	public RequestSpecification req;
	
	public void preCondition()
	{
		RestAssured.baseURI = "http://localhost:8080/";
		req = RestAssured.given();
		req.header("Content-Type","application/json");
	}

//	public static void main(String [] args) throws IOException
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Temp\\Selenium\\WebdriverChrom\\chromedriver_2.exe" );
//		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		
//		File ts=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(ts, new File("C:\\Users\\10667670\\eclipse-workspace\\FrameworkArt\\src\\test\\java\\image.jpg"));
//		//FileUtils.copyFile(ts,new File("C:\\Users\\10667670\\eclipse-workspace\\FrameworkArt\\src\\test\\java\\Base.screen.png"));
//	}
}
