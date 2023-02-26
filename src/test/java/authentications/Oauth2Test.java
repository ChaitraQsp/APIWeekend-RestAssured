package authentications;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class Oauth2Test {
	
	public static void main(String[] args) {
		
		baseURI = "http://coop.apps.symfonycasts.com";
		
		//Create a post request to geneerate the token
		Response resp = given()
						  .formParam("client_id", "APIWeekend")
						  .formParam("client_secret", "6c53b415f9be0ffd844521c1670adc56")
						  .formParam("grant_type", "client_credentials")
						  .formParam("redirect_uri", "http://example.com")
						  .formParam("code", "authorization_code")
						.when()
						  .post("/token");
		
		//Capture the token
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//Use the token for other requests
		given()
		  .auth().oauth2(token)
		  .pathParam("USER_ID", 4376)
		.when()
		  .post("/api/{USER_ID}/eggs-collect")
		.then().log().all();
		
		
	}

}
