package parameters;

import static io.restassured.RestAssured.*;

public class PathParameter {
	
	public static void main(String[] args) {
		
		baseURI = "https://reqres.in/";
		
		//Step 1: Create pre requisites
		given()
		 .pathParam("UserID", 6)
		.when()
		 .get("api/users/{UserID}")
		.then()
		 .log().all();
		
		//Step 2: Send the request and validate the response
		
		
		
	}

}
