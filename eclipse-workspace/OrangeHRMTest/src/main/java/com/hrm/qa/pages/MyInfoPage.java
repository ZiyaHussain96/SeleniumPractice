package com.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.qa.base.TestBase;

public class MyInfoPage extends TestBase
{
	
	@FindBy(xpath="//h1[contains(text(),'Personal Details')]")
	WebElement personaldetails;
	
	@FindBy(xpath="//input[@id='personal_txtEmployeeId']")
	WebElement emlpoyeeid;
	
	public MyInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifypersonaldetailslabel()
	{
		return personaldetails.isDisplayed();
	}
	
	public boolean verifyemloyeeidlabel()
	{
		return emlpoyeeid.isDisplayed();
	}
	public void selectFile(String description)
	{
		driver.findElement(By.xpath("//td[contains(text(),'"+description+"')]/parent::tr/descendant::td/input[@type='checkbox']")).click();
	
	}
}
