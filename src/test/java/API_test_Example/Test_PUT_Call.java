package API_test_Example;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PUT_Call {
	
	@Test
	public void postCall() {
		baseURI="https://reqres.in/api";
	//	given().header("content-type","application json");
		
		
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("Job", "Teacher");
		System.out.println(request.toJSONString());
		
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().put("/users").then().statusCode(201).log().all();
		
	}

}
