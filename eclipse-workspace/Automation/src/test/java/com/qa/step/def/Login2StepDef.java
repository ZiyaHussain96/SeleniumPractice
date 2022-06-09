package com.qa.step.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Login2StepDef 
{
	public WebDriver driver;
	
	
	@When("user opens url {string}")
	public void user_opens_url(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Temp\\Selenium\\WebdriverChrom\\chromedriver_2.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);

	}

	@Then("user clicks on Login")
	public void user_clicks_on_login() {
		driver.findElement(By.name("submit")).click();

	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
		Assert.assertEquals(driver.getTitle(), title);
		
	}

	@Then("closes the browser")
	public void closes_the_browser() 
	{
		driver.quit();
	}
	
	
}
