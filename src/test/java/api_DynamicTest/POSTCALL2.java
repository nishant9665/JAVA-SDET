package api_DynamicTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class POSTCALL2 {

	
	@Test
	public void PostCall_002(){
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		JSONObject js = new JSONObject();
		js.put("name", "morpheus");
		js.put("job", "leader");
		
		request.body(js.toJSONString());
		
		
		Response resp = request.post("api/users");
		
		 ResponseBody body = resp.getBody();
		 System.out.println("This is status Line :"+resp.getStatusLine());
		// System.out.println("This is status body "+body.asString());
		 
		 String bodyresp=body.asString();
		 
//		// JSONObject json = new JSONObject(bodyresp);  
//		 System.out.println(json.toString());  
//		 String technology = json.getString("technology");  
//		 System.out.println(technology);  
//	
		 
		 
		 
		 
		 
		
		
		
	}
}
