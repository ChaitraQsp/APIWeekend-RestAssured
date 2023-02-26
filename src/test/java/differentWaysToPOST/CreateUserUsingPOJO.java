package differentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import pojoclass.UserLibrary;

import static io.restassured.RestAssured.*;

public class CreateUserUsingPOJO {
	
	@Test
	public void createUser()
	{
		baseURI = "https://reqres.in";
		
		//Step 1: create data
		UserLibrary uLib = new UserLibrary("tom", "entertainer");
		
		//Step 2: send the request and validate response
		given()
		 .body(uLib)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/api/users")
		.then().log().all();

	}

}
