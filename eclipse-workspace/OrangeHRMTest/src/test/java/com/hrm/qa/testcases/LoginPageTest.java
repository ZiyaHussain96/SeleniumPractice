package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoard;
import com.hrm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase
{
	
	LoginPage loginpage;
	DashBoard dashboard;
	
	public LoginPageTest()
	{
		
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		 loginpage= new LoginPage();
		
	}
	
	
	@Test(priority=1) 
	public void loginLogoTest()
	{
		boolean logo=loginpage.validateloginpagelogo();
		Assert.assertTrue(logo);
			
	}
	
	@Test(priority=2)
	public void loginTitle()
	{
		
		String title=loginpage.loginpageTitle();
		Assert.assertEquals(title,"OrangeHRM");
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		dashboard=loginpage.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod 
	public void tearDown()
	{
		driver.close();
	}
	
	

}
