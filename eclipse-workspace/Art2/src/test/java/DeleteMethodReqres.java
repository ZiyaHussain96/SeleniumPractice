import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DeleteMethodReqres
{
	
	@Test	
	public void test()
	{
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification res = RestAssured.given();
		
		Response req = res.delete("/api/users/2");
		System.out.println(req.statusCode());
		
	}
	

}
