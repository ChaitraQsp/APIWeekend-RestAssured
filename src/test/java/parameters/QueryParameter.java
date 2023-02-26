package parameters;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	
	public static void main(String[] args) {
		
		baseURI = "https://reqres.in/";
		
        //Step 1: create prerequiste send the request and validate the resposne
		
		given()
		  .queryParam("page", 1)
		.when()
		  .get("api/users")
		.then()
		  .assertThat().statusCode(200)
		  .log().all();
		
		
	}

}
