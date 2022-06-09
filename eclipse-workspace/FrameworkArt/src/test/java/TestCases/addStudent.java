package TestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import Base.BaseClass;
import DataEntryPojo.StudentData;
import io.restassured.response.Response;

public class addStudent extends BaseClass
{	
	
	@Test
	public void AddStudent() 
	{
		/*RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		commenting out to write at one place and extends that class
		request.header("Content-Type","application/json");*/
		
		preCondition();
		/*String payload = "{\r\n"
				+ "  \"firstName\": \"Ziya\",\r\n"
				+ "  \"lastName\": \"Hussain\",\r\n"
				+ "  \"email\": \"ziyahussain1@gmail.com\",\r\n"
				+ "  \"programme\": \"Financial Analysis\",\r\n"
				+ "  \"courses\": [\r\n"
				+ "    \"Accounting\",\r\n"
				+ "    \"Statistics\"\r\n"
				+ "  ]\r\n"
				+ "}"; */
		
		StudentData std = new StudentData();
		std.setFirstName("ziya");
		std.setLastName("Hussain");
		std.setEmail("ziyahussain2@gmail.com");
		std.setProgramme("Financial Analysis");
		
		List<String> str = new ArrayList();
		str.add("Slelenium");
		str.add("API");
		
		std.setCourses(str);
				
		Response res = req.body(std).post("student/");
		
		
		/*Response res = req.body(payload).post("student/");*/
		System.out.println(res.getStatusCode());
	}

}
