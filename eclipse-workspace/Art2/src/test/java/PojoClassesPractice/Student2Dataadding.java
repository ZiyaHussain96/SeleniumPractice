package PojoClassesPractice;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Student2Dataadding {

	public static void main(String[] args)
	{
		Level2Structure ls = new Level2Structure();
		ls.setLastName("GAZI");// adding values
		ls.setFirstName("ERTUGRUL");
		ls.setEmail("ertrugrulgazi5@gamilcom");
		ls.setProgramme("freedom");
		
		Level2AnotherClass ls2 = new Level2AnotherClass(); //creating list bcoz this level2 class has list of input data
		ls2.setName("Fight"); //1st list of data 
		ls2.setScore("100");
		
		Level2AnotherClass ls3 = new Level2AnotherClass();//2 list of data
		ls3.setName("Intell");
		ls3.setScore("99.99");
		
		//here creating arraylist of 2nd level class to merge at one place
		//now this l1 ref variable holds both list of data
		List<Level2AnotherClass> l1 =new ArrayList();
		l1.add(ls2);
		l1.add(ls3);
		
		//mapping the data to courses whiuch is header of level2 data
		ls.setCourses(l1);
		
		RestAssured.baseURI = "http://localhost:8080/";
		RequestSpecification req = RestAssured.given();
		req.log().all();
		req.header("Content-Type","application/json");
		
		Response res  = req.body(ls).post("student/");
		System.out.println(res.getStatusCode());
		
		// we will get 400 bcoz its the problem of Student application
		
		
		
 



	}

}
