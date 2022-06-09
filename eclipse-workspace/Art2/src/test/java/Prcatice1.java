import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Prcatice1
{
	public static void main(String [] args)
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification req = RestAssured.given();
		
		
		Response res=req.get("api/users/2");
	//	System.out.println(res.getBody()); // gives the output as String object
	//	System.out.println(res.getStatusCode());
	//	System.out.println(res.getBody().asString()); //1
	//	System.out.println(res.asString()); //2 >>both 1 and 2 gives same output
	//	res.prettyPrint();//3
	//	res.getBody().prettyPrint();//4 >> 3 and 4 gives both same output
		
		System.out.println(res.getHeaders()); // gives all headers
		
		RequestSpecification req1 =RestAssured.given();
		
		Response res1=req1.get("api/users/23");
		System.out.println(res1.getBody().asString());
	//	System.out.println(res1.getHeader("via")); // returns the value of mentioned header
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
