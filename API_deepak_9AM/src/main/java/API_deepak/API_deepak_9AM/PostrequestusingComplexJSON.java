package API_deepak.API_deepak_9AM;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONObject;

public class PostrequestusingComplexJSON {

public static void main(String[] args) {
		
		JSONObject obj2= new JSONObject();
		obj2.put("Sector", "35-C");
		obj2.put("Landmark", "Near community Centre");
		obj2.put("City", "Chandigarh");
		
		
		JSONObject obj3= new JSONObject();
		obj3.put("primary email", "manikchandel2@gmail.com");
		obj3.put("Secondary_email", "manik.kumar@utradesolutions.com");
		
	
		JSONObject obj1= new JSONObject();
		obj1.put("First Name", "Test");
		obj1.put("Last Name", "kumar");
		obj1.put("Email", obj3);
		obj1.put("Adress", obj2);
		obj1.put("id", "M27");
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
