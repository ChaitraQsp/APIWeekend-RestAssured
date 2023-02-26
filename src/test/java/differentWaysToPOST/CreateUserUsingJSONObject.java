package differentWaysToPOST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserUsingJSONObject {
	
	@Test
	public void createUser()
	{
		baseURI = "https://reqres.in";
		
		//Step 1: Create the necessary data
		JSONObject jObj = new JSONObject();
		jObj.put("name", "Batman");
		jObj.put("job", "Actor");
		
		//Step 2: send the request and validate the response
		given()
		 .body(jObj)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/api/users")
		.then()
		 .assertThat().statusCode(201)
		 .contentType(ContentType.JSON)
		 .log().all();
	}

}
