import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonPathPractice 
{
	public static void main(String [] args)
	{

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		
		Response res = req.get("api/users?page=2");
	//	System.out.println(res.getStatusCode());
		
		// using Jsonpath to get particular field from the msg
		String st = res.getBody().asString();
		JsonPath js = new JsonPath(st);
		//System.out.println(js.get("data"));
		System.out.println(js.get("data[0]"));
		System.out.println(js.get("data[5]"));
		System.out.println(js.get("data[5].first_name"));
		//System.out.println(js.get("support.url"));
		//System.out.println(js.get("page"));
		//System.out.println(js.get("total_pages"));
	}

}
