package API_deepak.API_deepak_9AM;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class PostrequestingusingiorgArray {
	
public static void main(String[] args)
{
		
		JSONObject obj2= new JSONObject();
		obj2.put("Sector", "35-C");
		obj2.put("Landmark", "Near community Centre");
		obj2.put("City", "Chandigarh");
		
		
		JSONObject obj3= new JSONObject();
		obj3.put("primary email", "manikchandel2@gmail.com");
		obj3.put("Secondary_email", "manik.kumar@utradesolutions.com");
		
		
		JSONArray arr1=new JSONArray();
		arr1.add(0, obj2);
		arr1.add(1, obj3);
	
		JSONObject obj1= new JSONObject();
		obj1.put("First Name", "Test");
		obj1.put("Last Name", "kumar");
		obj1.put("id", "M102");
		obj1.put("Age", "24");
		obj1.put("KYC Detils", arr1);
		
		
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(obj1.toString())
		.when()
		.post("http://localhost:3000/MANIKapiBATCH");
		
		System.out.println("Status code is :"+res.statusCode());
	}

	
}
