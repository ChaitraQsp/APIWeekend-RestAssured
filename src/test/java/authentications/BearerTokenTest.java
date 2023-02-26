package authentications;

import java.util.HashMap;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	
	public static void main(String[] args) {
		
		baseURI = "https://api.github.com";
		
		//create the pre requisites
		HashMap map = new HashMap();
		map.put("name", "APIWeekend-Rest");
		map.put("description", "Rest Assured");
		
		given()
		  .auth().oauth2("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")//bearer Token
		  .body(map)
          .contentType(ContentType.JSON)
        .when()
          .post("/user/repos")
        .then().log().all();
		
		
		
	}

}
