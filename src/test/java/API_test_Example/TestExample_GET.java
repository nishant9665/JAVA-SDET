package API_test_Example;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestExample_GET {
	
	
	@Test
	public void test_01() {
		
		Response resp =RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("Status Code: "+resp.getStatusCode());
		System.out.println("Status Line: "+resp.getStatusLine());
		System.out.println("Time is : "+resp.getTime());
		System.out.println("Body is : "+resp.getBody().asString());
		System.out.println("Header is : "+resp.getHeader("content-type"));
		
		Assert.assertEquals(200, resp.getStatusCode());
		
	}

}
