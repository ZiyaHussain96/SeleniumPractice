package PojoClassesPractice;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Student1 
{
	public static void main(String [] args)
	{
		//creating object and populating values 
		Level1Difficulty lt = new Level1Difficulty();
		lt.setLastName("mohammed");
		lt.setFirstName("sameer");
		lt.setEmail("sameer786@gmail.com");
		lt.setProgramme("Natural lover");
		
		// to populate values in list we need to create Arraylist object and add
		List<String> ls= new ArrayList();
		ls.add("java");
		ls.add("pyhton");
		ls.add("selenium");
		
		lt.setCourses(ls);
		
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification req = RestAssured.given();
		
		req.header("Content-Type","application/json");
		
		Response res  = req.body(lt).post("student/");
		System.out.println(res.getStatusCode());
		
		
	}

}
