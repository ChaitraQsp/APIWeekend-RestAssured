package differentWaysToPOST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUserHashMap {
	
	@Test
	public void createUser()
	{
		baseURI = "https://reqres.in";
		
		//Step 1: Create the necessary data
		HashMap map = new HashMap();
		map.put("name", "Batman");
		map.put("job", "Actor");
		
		//Step 2: send the request and validate the response
		given()
		 .body(map)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/api/users")
		.then()
		 .assertThat().statusCode(201)
		 .contentType(ContentType.JSON)
		 .log().all();
	}

}
