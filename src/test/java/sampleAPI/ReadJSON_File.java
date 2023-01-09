package sampleAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class ReadJSON_File {

	@Test

	public void addBook() throws IOException {
		RestAssured.baseURI = "https://rahulshettyacademy.com";

		Response resp = given().

				header("Content-Type", "application/json").

				body(GenerateStringFromResource("./Data/data2.json")).

				when().

				post("/maps/api/place/add/json?key=qaclick123").

				then().assertThat().statusCode(200).

				extract().response();
		System.out.println(resp);

	//	JsonPath js = ReUsableMethods.rawToJson(resp);

		//String id = js.get("place_id");

		//System.out.println(id);
		// deleteBOok
	}

	public static String GenerateStringFromResource(String path) throws IOException {

		return new String(Files.readAllBytes(Paths.get(path)));
	}
}
