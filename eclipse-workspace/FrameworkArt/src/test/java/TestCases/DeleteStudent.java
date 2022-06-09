package TestCases;

import org.testng.annotations.Test;

import Base.BaseClass;
import io.restassured.response.Response;

public class DeleteStudent extends BaseClass
{
	@Test
	public void delStudent()
	{
		preCondition();
		Response res = req.delete("/student/103");
		System.out.println(res.getStatusCode());
	}

}
