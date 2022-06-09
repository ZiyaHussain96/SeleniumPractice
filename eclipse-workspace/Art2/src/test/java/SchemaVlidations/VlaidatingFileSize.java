package SchemaVlidations;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VlaidatingFileSize
{
	@Test	
	public void ValidatetestforFileszie()
	{
		//program to validate file size on local and net are same / not
		RestAssured.baseURI = "https://github.com/";
		RequestSpecification req = RestAssured.given();
		//on Net file
		Response res = req.get("SeleniumHQ/selenium/releases/download/selenium-4.0.0/selenium-java-4.0.0.zip");
		byte[] fileOnNet= res.then().extract().asByteArray(); // it will extract size in BYte
		int i1 = fileOnNet.length;
		System.out.println(i1);
		//on desktop file
		File fileOnDesk = new File("C:\\Users\\10667670\\Downloads\\selenium-java-4.0.0.zip");
		long i2 = fileOnDesk.length();
		System.out.println(i2);
		Assert.assertEquals(i1, i2);
				
	}

}
