package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoard;
import com.hrm.qa.pages.LeavePage;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.MyInfoPage;

public class DashBoardTest extends TestBase
{
	LoginPage loginpage;
	DashBoard dashboard;
	LeavePage leavepage;
	MyInfoPage myinfo;
	
	public DashBoardTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		LoginPage loginpage = new LoginPage();
		dashboard=loginpage.validatelogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyWelcomeTitleTest()
	{
		Assert.assertTrue(dashboard.welcomeText());
	}
	
	@Test(priority=2)
	public void verifyHrmLogoTest()
	{
		Assert.assertTrue(dashboard.HrmLogo());
	}
	
	@Test(priority=3)
	public void verifyLeaveTest()
	{
		leavepage=dashboard.clickLeaveLink();
	}
	
	@Test(priority=4)
	public void verifyMyinfoLinktest()
	{
		myinfo=dashboard.clickMyInfoLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
