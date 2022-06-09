package com.qa.step.def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination
{

	WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page()
	{	
		System.setProperty("webdriver.chrome.driver","C:\\Temp\\Selenium\\WebdriverChrom\\chromedriver_2.exe" );
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@When("enter valid username and password and click")
	public void enter_valid_username_and_password_and_click() throws InterruptedException
	{
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();


	}
	@Then("home page is displayed")
	public void home_page_is_displayed()
	{
		Assert.assertEquals(driver.getTitle(), "Login: Mercury Tours");
	}

	@Then("close the browser")
	public void close_browser()
	{
		driver.quit();
	}

}
