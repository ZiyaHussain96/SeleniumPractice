import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAuthentication1
{
	@Test
	public void test()
	{
	RestAssured.baseURI = "https://postman-echo.com";
	RequestSpecification req = RestAssured.given();
	Response res  = req.auth().basic("postman", "password").get("/basic-auth");
	
	System.out.println(res.getStatusCode());
	}
	

}
