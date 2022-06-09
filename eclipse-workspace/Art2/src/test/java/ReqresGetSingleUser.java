import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresGetSingleUser {

	public static void main(String[] args) {


		RestAssured.baseURI ="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		 
		Response res = request.get("api/users?page=3");
		System.out.println(res.getStatusCode());
		//System.out.println(res.getBody().asString());
		System.out.println(res.getBody().prettyPrint());
		

	}

}
