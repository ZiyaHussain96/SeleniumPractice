import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetrequsetfromStudentApp
{
	public static void main(String [] args)
	{
		
		// getting value from student and parsing acc
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification req = RestAssured.given();
		
		
		Response res = req.get("student/2");
		
		//System.out.println(res.getStatusCode());
		//System.out.println(res.getBody().asString());
		res.getBody().prettyPrint();
		
		String s = res.getBody().asString();
		
		JsonPath js = new JsonPath(s);
		System.out.println(js.get("id"));
		System.out.println(js.get("courses[0]"));
	}

}
