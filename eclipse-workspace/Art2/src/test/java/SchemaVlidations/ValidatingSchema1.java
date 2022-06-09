package SchemaVlidations;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;

public class ValidatingSchema1
{
	@Test
	public void test()
	{
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification req = RestAssured.given();
	
		Response res  = req.get("student/1");
		
		File f = new File("C:\\Users\\10667670\\eclipse-workspace\\Art2\\src\\test\\java\\SchemaVlidations\\SchemaJson1");
		
		res.then().body(matchesJsonSchema(f)); //hamcrest method for schema validation
	}

}
