    package dataParsingOrgJson;

	import static com.jayway.restassured.RestAssured.given;

import java.util.Set;

import org.json.JSONArray;
    import org.json.JSONObject;

	import com.jayway.restassured.http.ContentType;
	import com.jayway.restassured.response.Response;

	public class ParsingALLKeysOfObject {

		public static void main(String[] args) {

			Response res=
					given()
					.contentType(ContentType.JSON)
					.when()
					.get("http://localhost:3000/MANIKapiBATCH"); 
			
			//get request for all the records 
		  /* extracting ALL  key value from response object through org.json */
		  
		        JSONArray data = new JSONArray(res.asString());
		        int length=data.length();
		        for(int i=1;i<=length-1;i++)
		        {
		        	
			       JSONObject obj1=data.getJSONObject(i); //getting json object from array  
			       Set<String> keys =obj1.keySet();
			       
			      for(String k : keys)
			      {
			    	System.out.println("Key is  "+k+"   value is  "+obj1.get(k));  
			      }
			 System.out.println("-------------------------------------"+"object"+i+"------------------------");
		}
		  

		
	}
}