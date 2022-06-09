import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JsonObjectandJsonArrayPractice 
{
	public static void main(String [] args)
	{
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification request = RestAssured.given();
		
		// to print the log
		//request.log().all();
		
		request.header("Content-Type","application/json");
		
		JSONObject jo = new JSONObject();
		
		// put is method which is used to add the data
		jo.put("firstName", "ABD");
		jo.put("lastName", "Villers");
		jo.put("email","abdvillers@399gmail.com");
		jo.put("programme","Financial");
		
		JSONArray ja = new JSONArray();
		ja.put("Accounting");
		ja.put("Statistics");
		
		// this is aslo key with array as entry
		// ex{
	    
	 /*   "firstName": "ziya",
	    "lastName": "mohammed",
	    "email": "sameer785@Duisac.net",
	    "programme": "Financial Analysis",
	    "courses": [
	        "Accounting",
	        "Statistics"
	    ]
	}*/
		jo.put("courses", ja);
		// toString method is to extract the data from Object as String bcoz jo is an Object
		
		System.out.println(jo);
		
		 Response res = request.body(jo.toString()).post("student/");
		 System.out.println(res.getStatusCode());
	
		// output will not be in proper order as fname,lastname,email it may change
		//bcoz JSON doesn't follow order of insertion
				
	}

}
