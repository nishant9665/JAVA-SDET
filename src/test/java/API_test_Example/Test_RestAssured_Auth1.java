package API_test_Example;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Test_RestAssured_Auth1 {
	
	@Test
	public void authStatus_Code() {
		
		int code= RestAssured.given()
				.auth().preemptive()
				.basic("postman","password")
				.when()
				.get("https://postman-echo.com/basic-auth")
				.getStatusCode(); 
		
	System.out.println("Response code from server is :"+code);	
	
	}
}
