package authentications;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import pojoclass.UserLibrary;

public class BasicAuthTest {
	
	public static void main(String[] args) {
		
	   baseURI = "https://reqres.in/";	
		
	   //Create the prerequites
	   UserLibrary uLib = new UserLibrary("Chaitra", "Tester");
	   
	   //send the request and validate the response
	   given()
	     .auth().basic("username", "password")
	     .body(uLib)
	     .contentType(ContentType.JSON)
	   .when()
	     .post("api/users")
	   .then().log().all();
		
	}

}
