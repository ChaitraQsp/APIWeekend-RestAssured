package practice.CRUDOperations;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetUserUsingBDD {
	
	@Test
	public void getUser()
	{
		baseURI = "https://reqres.in/";
		
		//Step 1: create necessary data
		
		//Step 2: send the request and validate the response
		when()
		 .get("api/users/2")
		.then()
		 .assertThat().statusCode(200)
		 .log().all();
		
	}

}
