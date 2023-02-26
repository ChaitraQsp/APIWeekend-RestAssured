package requestChaining;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoclass.UserLibrary;

public class CreateUserAndGetUser {
	
	public static void main(String[] args) {
		
		baseURI = "https://reqres.in/";
		
		//Step 1: Create the user using POST request
		UserLibrary ulib = new UserLibrary("Chaitra", "Tester");
		
		Response resp = given()
						.body(ulib)
						.contentType(ContentType.JSON)
						.when()
						.post("api/users");
		
		//Step 2: Capture the required data from the response
		String UserID = resp.jsonPath().get("id");
		System.out.println(UserID);
		
		//Step 3: Use that data in GET request
		given()
		  .pathParam("uid", UserID)
		 .when()
		  .get("api/users/{uid}")
		 .then().log().all();
		
	}

}
