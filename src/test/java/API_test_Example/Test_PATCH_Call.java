package API_test_Example;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test_PATCH_Call {
	
	@Test
	public void patchCall() {
		baseURI="https://reqres.in/api";
	//	given().header("content-type","application json");
		
	//	Map<String,Object> map = new HashMap<String,Object>();
		
		JSONObject request = new JSONObject();
		request.put("name", "Nishant");
		request.put("Job", "QA");
		System.out.println(request.toJSONString());
		
		given().header("Content-Type","application/json").
		contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().patch("/users/2").then().statusCode(200).log().all();
		
	}

}
