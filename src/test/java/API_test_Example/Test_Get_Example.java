package API_test_Example;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Test_Get_Example {
	
	@Test(enabled=true)
	public void get() {
		
		//RestAssured.baseURI=
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[4].first_name",equalTo("George")).log().all(); 
        }
	

	}


