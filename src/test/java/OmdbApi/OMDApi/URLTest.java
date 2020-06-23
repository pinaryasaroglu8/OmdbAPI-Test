package OmdbApi.OMDApi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.io.IOException;

public class URLTest {

	public static String URL(String s) throws IOException {

		RestAssured.baseURI = "http://www.omdbapi.com";
		Response response = given().when().post(s).then().extract().response();
		String stringResponse = response.asString();

		int responseCode = response.getStatusCode();
		Variables.setResponseCode(responseCode);

		return stringResponse;

	}
}