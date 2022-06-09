import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstReastassured {

	public static void main(String[] args)
	{

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		
		Response res=  request.get("api/users?page=2");
		//System.out.println(res.getStatusCode()); // gives code
		System.out.println(res.getBody()); // gives in string object
		System.out.println(res.getBody().asString());// gives in proper msg format in one line
		//System.out.println(res.getBody().prettyPrint()); // gives msg format

	}

}
