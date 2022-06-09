package PojoClassesPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsinTestNG 
	
{
	@Test
	public void test1()
	{
		System.out.println("1 test started");
		Assert.assertEquals("navE", "nave","raise a bug");
		System.out.println("1 test ended");
	}
	
	//both testcases are ex for HARD assertions
	@Test
	public void test2()
	{
		System.out.println("2 test started");
		Assert.assertTrue(true,"raise a bug");
		System.out.println("2 test ended");
	}
}
		
	