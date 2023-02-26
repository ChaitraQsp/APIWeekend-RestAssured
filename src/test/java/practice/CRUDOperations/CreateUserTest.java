package practice.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest 
{
	 @Test
	 public void createUserTest()
	 {
		 //Step 1: Create the necessary Data - request body
		 JSONObject jObj = new JSONObject();
		 jObj.put("name", "Chaitra");
		 jObj.put("job", "Tester");
		 
		 //Step 2: Send the request
		 RequestSpecification request = RestAssured.given();
		 request.body(jObj);
		 request.contentType(ContentType.JSON);
		 Response resp = request.post("https://reqres.in/api/users");
		 
		 //Step 3: Validate the response
		 System.out.println(resp.prettyPeek());
	 }

}
