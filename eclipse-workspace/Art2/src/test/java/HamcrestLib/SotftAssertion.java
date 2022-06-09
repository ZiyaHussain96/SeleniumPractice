package HamcrestLib;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;


public class SotftAssertion
{
	@Test
	public void test1()
	{
		
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/student/2");	
		
		res.then().body("lastName", equalTo ("Hlmes"), "firstName", equalTo ("Murphy"));
		 //In hamcrest SOFT assertion not working
		
	}
	
	@Test
	public void test2()
	{
	
		// In HaMCRESt soft assertion below line will not be exceuted if any1 cond fail not like Testng Soft Assertion
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/student/2");	
		System.out.println("2nd test started");
		res.then().body("courses[0]", equalTo ("Accountng"), "courses[1]", equalTo ("Statstics"));
		System.out.println("2nd test ended");
	}
}
