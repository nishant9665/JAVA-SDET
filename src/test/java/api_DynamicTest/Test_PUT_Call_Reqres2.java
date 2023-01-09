package api_DynamicTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Test_PUT_Call_Reqres2 {
	
	@Test
	public void createRegistration() {
		RestAssured.baseURI ="https://reqres.in"; 
		
	    RequestSpecification request = RestAssured.given(); 
	    
	    JSONObject requestParams = new JSONObject();
	    
	    requestParams.put("name", "morpheus");
	    requestParams.put("job", "zion resident"); 
	    
	    request.body(requestParams.toJSONString());
	    
	    Response response = request.put("/api/users/2"); 
	    ResponseBody body = response.getBody();
	    System.out.println("This is status Line :"+response.getStatusLine());
	    System.out.println("This is status body "+body.asString());
	    System.out.println("This is status code "+response.getStatusCode());
	}

}
