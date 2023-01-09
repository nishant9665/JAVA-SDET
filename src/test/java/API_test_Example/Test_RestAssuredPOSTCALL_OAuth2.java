package API_test_Example;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_RestAssuredPOSTCALL_OAuth2 {
	

	@Test
	public void accessValid_Oauth2() {
		
		Response  resp= RestAssured.given()
		.formParam("client_id", "NishantApp")
		.formParam("client_secret", "be152523c8e70d27d44e5cd8b44dd738")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		String token=resp.jsonPath().get("access_token");
		System.out.println(token);
		
		Response  resp2= RestAssured.given()
				.auth()
				.oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/3725/eggs-collect");
				
				System.out.println("Status Code : "+resp2.getStatusCode());
		
	}
}
