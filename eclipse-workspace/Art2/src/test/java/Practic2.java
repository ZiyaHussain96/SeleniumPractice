import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practic2
{
	public static void main(String [] args)
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		
		Response res = req.get("api/users/2");
		System.out.println(res.getStatusCode());
		
		// using Jsonpath to get particular field from the msg
		String st = res.getBody().asString();
		
		//JsonPath requires input as String of the msg
		JsonPath js= new JsonPath(st);
		System.out.println(js.get("data"));
		System.out.println(js.get("support"));
		System.out.println(js.get("data.id"));
		System.out.println(js.get("support.text"));
	}

}
