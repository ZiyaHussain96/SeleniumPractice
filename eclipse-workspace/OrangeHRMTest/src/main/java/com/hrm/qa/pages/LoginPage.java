package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class LoginPage extends TestBase
{
	
	//PageFactory - OR(object repository)
	
	@FindBy(id="txtUsername") WebElement username;
	
	@FindBy(id="txtPassword") WebElement password;
	
	@FindBy(id="btnLogin") WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]") WebElement forgotpassword;
	
	@FindBy(xpath="//div[@id='divLogo']/img") WebElement HRMlogo;
	
	
	//Initializing web elements/objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String loginpageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateloginpagelogo()
	{
		
		return HRMlogo.isDisplayed();
	}
	
	public DashBoard validatelogin(String un,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new DashBoard();
	}
	
	
	

}
