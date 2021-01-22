package API_deepak.API_deepak_9AM;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONObject;

/* will hit the post request
 * will send simple json data 
 * will create data using simple json 
*/
class PostrequsingorgJSON {
	public static void main(String[] args) {
		
		JSONObject obj1= new JSONObject();
		obj1.put("First Name", "Test");
		obj1.put("Last Name", "kumar");
		obj1.put("Email", "chandelmanik@gmail.com");
		obj1.put("id", "M24");
		obj1.put("Age", "24");
		
		Response res=
				
		given()
		.contentType(ContentType.JSON)
		.body(obj1.toString())
		.when()
		.post("http://localhost:3000/MANIKapiBATCH");
		
		System.out.println("Status code is :"+res.statusCode());
	}
	

}
