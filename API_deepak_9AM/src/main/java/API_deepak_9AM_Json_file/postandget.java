package API_deepak_9AM_Json_file;

import static com.jayway.restassured.RestAssured.given;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class postandget {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		for(int i=1;i<=100;i++)
		{
			
		System.out.println("============================= start of the loop ==========================");
		Random r = new Random();
		Integer data= r.nextInt();
		
		File f = new File("../API_deepak_9AM/src/main/java/org/testing/payload/complexjson.json");
		FileInputStream fi = new FileInputStream(f); 
		JSONTokener jt = new JSONTokener(fi);
		JSONObject jo =new JSONObject(jt);
		
	     	String jo_data=jo.toString();
			String id="id";
	     	String var=data.toString();
	     	System.out.println(var);
	     	
			String jo_replaced=jo_data.replaceAll(Pattern.quote("{{"+id+"}}"),var); 
		
			System.out.println("data after replacing"+ jo_replaced);
			
			Response res= 
				 given()
				.contentType(ContentType.JSON)
				.body(jo_replaced.toString())
				.when()
				.post("http://localhost:3000/MANIKapiBATCH");
				System.out.println("Response"+res.statusCode());
				System.out.println("Reponse time "+res.getTime());
	        	System.out.println("Response"+res.statusLine());
	        	
	        	
	        	Response res_get= 
	   				 given()
	   				.contentType(ContentType.JSON)
	   				.body(jo.toString())
	   				.when()
	   				.get("http://localhost:3000/MANIKapiBATCH/"+var);
	   				
	        		System.out.println("Response"+res_get.asString());
	   				
	   				
	   				System.out.println("============================= end of the loop ==========================");
	   				
		}	
	   				
	   				
	}
	

	
	

}
