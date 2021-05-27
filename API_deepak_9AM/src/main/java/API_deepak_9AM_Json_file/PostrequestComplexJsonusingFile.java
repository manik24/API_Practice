 package API_deepak_9AM_Json_file;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostrequestComplexJsonusingFile {
	
public static void main(String[] args) throws FileNotFoundException {
		
		File f =  new File("../API_deepak_9AM/src/main/java/org/testing/payload/complexjson.json");
		FileInputStream fi = new FileInputStream(f);
		JSONTokener jt= new JSONTokener(fi);
		JSONObject jo= new JSONObject(jt);
		
		Response res= 
				 given()
				.contentType(ContentType.JSON)
				.body(jo.toString())
				.when()
				.post("http://localhost:3000/MANIKapiBATCH");
		System.out.println("Response"+res.asString());
		
		
   }
}
