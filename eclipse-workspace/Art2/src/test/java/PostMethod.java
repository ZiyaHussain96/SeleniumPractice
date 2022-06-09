import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod 
{

	public static void main(String [] args)
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		String s="{\r\n"
				+ "    \"name\": \"sren1\",\r\n"
				+ "    \"job\": \"Hussain\"\r\n"
				+ "}";
		
		req.header("Content-Type","application/json");
		
		Response res = req.body(s).post("api/users");
		System.out.println(res.getStatusCode());
		res.getBody().prettyPrint();
		
		// finding the id of added user
				
		Response res1 = req.get("api/users");
		
		String st1 = res.getBody().asString();
		
		JsonPath js1 = new JsonPath(st1);
		int ts = js1.get("reqres.size()");
		
		for(int i =0;i<ts;i++)
		{
			if(js1.get("["+i+"].name").equals("sren1"))
			{
				System.out.println(js1.get("["+i+"].id"));
			}
		}
		
		
	}
}
