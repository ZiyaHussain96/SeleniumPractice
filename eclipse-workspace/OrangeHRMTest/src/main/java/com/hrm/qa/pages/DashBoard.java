package com.hrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class DashBoard extends TestBase
{
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement Hrmlogo;
	
	@FindBy(xpath="//a[contains(text(),'Welcome ')]") 
	WebElement welcomeText;
	
	@FindBy(xpath="//b[contains(text(),'My Info')]")
	WebElement myInfo;
	
	
	@FindBy(xpath="//b[contains(text(),'Performance')]")
	WebElement performance;
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement leave;
	
	public DashBoard()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public  boolean welcomeText()
	{
		return welcomeText.isDisplayed();
	}
	public  boolean HrmLogo()
	{
		return Hrmlogo.isDisplayed();
	}
	
	
	public MyInfoPage clickMyInfoLink()
	{
		myInfo.click();
		return new MyInfoPage();
	}
	
	public PerformancePage clickPerformancePageLink()
	{
		performance.click();
		return new PerformancePage();
	}
	public LeavePage clickLeaveLink()
	{
		leave.click();
		return new LeavePage();
	}
	

}
