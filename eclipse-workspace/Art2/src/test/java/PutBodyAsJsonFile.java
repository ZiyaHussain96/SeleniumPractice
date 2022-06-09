import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutBodyAsJsonFile
{
	public static void main(String [] args)
	{
		
		//passing input data as File Format
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type","application/json");
		
		// need to create Jsonfile and enter msg in it then create a file object and run
		File f = new File("C:\\Users\\10667670\\eclipse-workspace\\Art2\\src\\test\\java\\payload.json");
		Response res = request.body(f).post("student/");
		
		System.out.println(res.getStatusCode());
	}

}
