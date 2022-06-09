import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GettingID 
{

	public static void main(String [] args)
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("api/users/2");
		System.out.println(res.getStatusCode());
		
		
		// parsing json using json class
		
		String st = res.getBody().asString();
		
		JsonPath js = new JsonPath(st);
		System.out.println(js.get("data"));
		System.out.println(js.get("data.id"));
	
		
	}
	
}
