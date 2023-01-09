package API_test_Example;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class APIchaining {

	@Test
	public void createBooking(ITestContext context)
	{
		int bookingId = RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			
			.contentType(ContentType.JSON)
			.body("booking.json")
		.when()
			.post()
		.then()
			.log()
			.all()
			.extract()
			.jsonPath()
			.get("bookingid");
		// Storing data in a context to use for other tests
		context.setAttribute("bookingId", bookingId);
	}
}
