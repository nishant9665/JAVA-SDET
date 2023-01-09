package api_DynamicTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Test_PATCH_Call_Reqres3 {
	
	@Test
	public void createRegistration() {
		RestAssured.baseURI ="https://reqres.in"; 
		
	    RequestSpecification request = RestAssured.given(); 
	    
	    JSONObject requestParams = new JSONObject();
	    
	    requestParams.put("name", "morpheus");
	    requestParams.put("job", "QA-Automations"); 
	    
	    request.body(requestParams.toJSONString());
	    
	    Response response = request.patch("/api/users/2"); 
	    ResponseBody body = response.getBody();
	    System.out.println("This is status Line :"+response.getStatusLine());
	    System.out.println("This is status body "+body.asString());
	    System.out.println("This is status code "+response.getStatusCode());
	}

}
