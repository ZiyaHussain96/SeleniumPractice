package PojoClassesPractice;

import java.util.List;

public class Level2Structure
{
	String lastName;
	String firstName;
	String email;
	String programme;
	
	//perparing input body of the msg  and Level2AnotherClass has list of data so list of that class
	List<Level2AnotherClass> courses;
		
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	
	public List<Level2AnotherClass> getCourses() {
		return courses;
	}
	public void setCourses(List<Level2AnotherClass> courses) {
		this.courses = courses;
	}


	
	
}
