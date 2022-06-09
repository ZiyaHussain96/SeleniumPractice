import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PracticeRestWithStudent
{
	public static void main(String [] args)
	{
		
		// practing post method on Studen App and getting added entry ID
		//Important
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		
		String s = "{\r\n"
				+ "    \r\n"
				+ "    \"firstName\": \"Murphy\",\r\n"
				+ "    \"lastName\": \"Holmes\",\r\n"
				+ "    \"email\": \"faucibus.orci.luctus274@Duisac.net\",\r\n"
				+ "    \"programme\": \"Financial Analysis\",\r\n"
				+ "    \"courses\": [\r\n"
				+ "        \"Accounting\",\r\n"
				+ "        \"Statistics\"\r\n"
				+ "    ]\r\n"
				+ "}";
		
		request.header("Content-Type","application/json");
		
		Response res = request.body(s).post("student/");
		
		System.out.println(res.getStatusCode());
		res.getBody().prettyPrint();
		
		
		// to fetch the added entry
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request1 = RestAssured.given();
		
		Response req1 = request1.get("student/");
		
		String st = req1.getBody().asString();
		
		JsonPath js =  new JsonPath(st);
		
		int totalnumofrecords = js.get("student.size()");
		
		for(int i=0;i<totalnumofrecords;i++)
		{
			if(js.get("["+i+"].email").equals("faucibus.orci.luctus200@Duisac.net"))
			{
				System.out.println(js.get("["+i+"].id"));
				break;
			}
		}
		
		
		
		
		
		
		
		
	}

}
