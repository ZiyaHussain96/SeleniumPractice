import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethodPractice
{
	public static void main(String [] args)
	{
		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		
		String payload = "{\r\n"
				+ "    \"name\": \"morp\",\r\n"
				+ "    \"job\": \"lead\"\r\n"
				+ "}";

		req.header("Content-Type","application/json");
		
		Response res = req.body(payload).post("api/users");
		
		System.out.println(res.getStatusCode());
		res.getBody().prettyPrint();
		
		
		//Program to post and find the id of posted data
		
		RequestSpecification req1 = RestAssured.given();
		Response res1 = req1.get("api/users");
		String s = res1.getBody().asString();
		JsonPath jj = new JsonPath(s);
		
		for(int i=0;i<10;i++)
		{
			if(jj.get("["+i+"].name").equals("morp"))
			{
				System.out.println(jj.get("["+i+"].id"));
				
			}
		}
		
		
		
		
		
		
	}

}
