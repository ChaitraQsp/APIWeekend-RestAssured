package parameters;

import static io.restassured.RestAssured.*;

public class FormParameter {
	
	public static void main(String[] args) {
		
		baseURI = "https://reqres.in/";
		
		//Step1 : create preq requisites send the request and validate the response
		
		given()
		  .formParam("name", "Chaitra")
		  .formParam("job", "Tester")
		.when()
		  .post("api/users")
		.then()
		  .log().all();
		
		
		
	}

}
