package HamcrestLib;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Program1
{
	@Test
	public void test1()
	
	{
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/student/2");
		
		String st = res.getBody().asString();
		JsonPath js = new JsonPath(st);
		
		System.out.println(res.getStatusCode());
		
		//System.out.println(js.get("id"));
		//System.out.println(js.get("courses[1]"));
		
		//TestNG Hard-assertion if test case fails next line will not execute 
		Assert.assertEquals(js.get("lastName"),("holmes"));
		System.out.println("expected value matched"); // this line not executed bcoz its hard assertion above condition is failed 
		
	}
	@Test
	public void test2()
	{
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/student/2");
		
		String st = res.getBody().asString();
		JsonPath js = new JsonPath(st);
		
		System.out.println(res.getStatusCode());
		
		
		Assert.assertEquals(js.get("courses[0]"),("Accounting"));
		System.out.println("expected 2 value matched");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
