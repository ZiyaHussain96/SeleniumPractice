package PojoClassesPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTestNG 
	
{	
	
	@Test
	public void test1()
	{
		//soft assert 
		SoftAssert sa = new SoftAssert();
		System.out.println("test1 started");
		sa.assertEquals(12, 15,"report bug");
		System.out.println("test 1 ended");
		sa.assertAll(); // it is must need to be given without this it will not validated and goves just pass
		
	}
	
	@Test
	public void test2()
	{
		//hard assertion 
		System.out.println("test 2 started");
		Assert.assertEquals(12, 19,"report 2 bug");
		System.out.println("test 2 ended");
	}
	

}
