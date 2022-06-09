import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeletemethoStudentApp
{
	
	public void test()
	{
		RestAssured.baseURI = "http://localhost:8080";
		RequestSpecification req= RestAssured.given();
		
		Response resp = req.delete("/student/5");
		System.out.println(resp.statusCode());
	}

}
