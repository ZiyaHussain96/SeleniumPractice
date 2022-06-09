package HamcrestLib;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matcher;

public class Practice2 
	{
	
	@Test	
	public void test1()
	{
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("/student/2");
		
		// validation thru HAMcrest Lib but it is also <hard assertion>
		res.then().body("lastName", equalTo ("Holmes"));
		res.then().body("courses[0]", equalTo("Accounting"));
		
		// this 4 also HARD asserions
		res.then().body("firstName", equalTo ("Murphy")) // remove semicolon for further statments
				  .body("courses[1]", equalTo ("Statistics")); // we can write like also in-short	
		System.out.println(res.getStatusCode());
		
		
	}

	

}
