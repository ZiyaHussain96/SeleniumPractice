package com.hrm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashBoard;
import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.MyInfoPage;


public class MyInfoTest extends TestBase
{
	LoginPage loginpage;
	DashBoard dashboard;
	MyInfoPage myinfo;
	
	public MyInfoTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		LoginPage loginpage=new LoginPage();
		DashBoard dashboard = new DashBoard();
		dashboard=loginpage.validatelogin(prop.getProperty("username"),prop.getProperty("password"));
		myinfo = dashboard.clickMyInfoLink();
	}
	
	@Test(priority=1)
	public void verifyPersonalDetailslabel()
	{
		Assert.assertTrue(myinfo.verifypersonaldetailslabel());
	}
	
	@Test(priority=2)
	public void verifyeEmployeeIdLabel()
	{
		Assert.assertTrue(myinfo.verifyemloyeeidlabel());
	}
	
	@Test(priority=3)
	public void selectFile()
	{
		myinfo.selectFile("Zakeer"); // its dynamic values are changing in site code is correct
		myinfo.selectFile("Ziya");
		myinfo.selectFile("Hussain");
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
