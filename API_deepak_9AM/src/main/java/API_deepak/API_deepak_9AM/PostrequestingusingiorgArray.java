package API_deepak.API_deepak_9AM;

import static com.jayway.restassured.RestAssured.given;

import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;



public class PostrequestingusingiorgArray {
	
public static void main(String[] args)
{
		
	JSONObject obj2= new JSONObject();
	obj2.put("primary email", "manikchandel2@gmail.com");
	obj2.put("Secondary_email", "manik.kumar@utradesolutions.com");

		Random r = new Random();
		Integer data= r.nextInt();
		
		JSONObject obj1= new JSONObject();
		obj1.put("First Name", "Test");
		obj1.put("Last Name", "kumar");
		obj1.put("id", data);
		obj1.put("Age", "24");
		obj1.put("Email", obj2);
		
	
	
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(obj1.toString())
		.when()
		.post("http://localhost:3000/MANIKapiBATCH");
		
		System.out.println("Status code is :"+res.statusCode());
		System.out.println(res.asString());
		
	    JSONObject json= new JSONObject(res.asString());
		JSONObject data_extracted=json.getJSONObject("Email");
		
		String data1_extracted=data_extracted.getString("primary email").toString();
		
		System.out.println("data Extracted : "+data1_extracted);
		
		
		Response res1=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/MANIKapiBATCH?primary email="+data1_extracted);
		
		
		System.out.println("==========================================");
		System.out.println(res1.asString());
		
			
	}

private static JSONArray JSONObject(String asString) {
	// TODO Auto-generated method stub
	return null;
}

	
}
