package dataParsingOrgJson;

import static com.jayway.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;



public class ParsingUsingOrgJsonSingleValue {

	public static void main(String[] args) {
		
		
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				//.get("http://localhost:3000/MANIKapiBATCH"); //get request for all the records 
		        .get("http://localhost:3000/MANIKselneiumBATCH");
	  /* extracing single key value from response through org.json */
	  
		
		System.out.println(res.asString());
		System.out.println("====================================================");
		
		/*
		
		
	        JSONArray data = new JSONArray(res.asString());
	        String data_extracted = data.getJSONObject(10).get("id").toString();
	        System.out.println("Data extracted:"+data_extracted);
		
	      */
		
		//JSONObject data  = new JSONObject(res.asString());
		JSONObject data  = new JSONObject(res.asString()).getJSONObject("email");
		Set<String> keys = data.keySet();
		for(String key : keys)
		{
		String data_extracted = data.get(key).toString();
		System.out.println("data extracted for "+key+" "+ ":"+data_extracted);
		}   
	        
	}
	  
	           
	          
	           
	          
	  
	  
	
	
}
