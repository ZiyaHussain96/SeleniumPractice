package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import io.restassured.response.Response;

public class GetStudent extends BaseClass
{	
	@Test
	public void getStudent()
	{
		preCondition();
		
		Response res=req.get("/student/103");
		System.out.println(res.getStatusCode());
		
		
		
	}

}
