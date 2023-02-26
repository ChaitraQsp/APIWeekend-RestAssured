package practice.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUserTest {
	
	@Test
	public void getUserTest()
	{
		//Step 1: create necessary data
		
		//Step 2: send the request
		Response resp = RestAssured.get("https://reqres.in/api/users/2");
		
		//Step 3: validate the response
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getStatusLine());
		System.out.println(resp.getContentType());
		System.out.println(resp.prettyPeek());
	}

}
