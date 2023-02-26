package practice.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateUsingBDD {
	
	@Test
	public void updateUser()
	{
		baseURI = "https://reqres.in";
		
		//Step 1: create necessary data
		JSONObject jObj = new JSONObject();
		//jObj.put("name", "morpheus");
		jObj.put("job", "tester");
		
		//Step 2: send the request and validate the response
		given()
		.body(jObj)
		.contentType(ContentType.JSON)
		.when()
		.patch("/api/users/2")
		.then().log().all();
	}

}
