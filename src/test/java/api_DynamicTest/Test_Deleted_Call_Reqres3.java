package api_DynamicTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Test_Deleted_Call_Reqres3 {
	
	@Test
	public void createRegistration() {
		RestAssured.baseURI ="https://reqres.in"; 
		
	    RequestSpecification request = RestAssured.given(); 
	    
	    Response response = request.delete("/api/users/2"); 
	    ResponseBody body = response.getBody();
	    System.out.println("This is status Line :"+response.getStatusLine());
	    System.out.println("This is status body "+body.asString());
	    System.out.println("This is status code "+response.getStatusCode());
	}

}
