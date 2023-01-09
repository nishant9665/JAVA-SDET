package API_test_Example;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Test_POST_UserRegistrationSuccessful {
	
	@Test
	public void createRegistration() {
		RestAssured.baseURI ="https://demoqa.com/Account/v1"; 
		
	    RequestSpecification request = RestAssured.given(); 
	    
	    JSONObject requestParams = new JSONObject();
	    
	    requestParams.put("userName", "test_rest");
	    requestParams.put("password", "Testrest@123"); 
	    
	    request.body(requestParams.toJSONString());
	    
	    Response response = request.post("/User"); 
	    ResponseBody body = response.getBody();
	    System.out.println("This is status Line :"+response.getStatusLine());
	    System.out.println("This is status body "+body.asString());
	}

}
