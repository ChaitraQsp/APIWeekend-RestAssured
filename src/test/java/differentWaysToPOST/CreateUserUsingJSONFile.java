package differentWaysToPOST;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUserUsingJSONFile {
	
	@Test
	public void createUser() throws FileNotFoundException
	{
		baseURI = "https://reqres.in/";
		
		//Step 1: create data
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\data.json");
		
		//Step 2: send the request and validate the resposne
		given()
		 .body(fis)
		 .contentType(ContentType.JSON)
		.when()
		 .post("api/users")
		.then().log().all();
	}

}
