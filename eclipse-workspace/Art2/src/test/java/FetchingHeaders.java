import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FetchingHeaders 
{
	public static void main(String [] args)
	{
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		Response res = req.get("api/users?page=3");
		System.out.println(res.getStatusCode());
		// print the headers
		
		//System.out.println(res.getHeaders());
		//print single header which we want
		System.out.println(res.getHeader("Connection"));
	}

}
