    package dataParsingOrgJson;

	import static com.jayway.restassured.RestAssured.given;

	import org.json.JSONArray;
	import org.json.JSONObject;

	import com.jayway.restassured.http.ContentType;
	import com.jayway.restassured.response.Response;

	public class ParsingUsingOrgJsonMultipleValue {

		public static void main(String[] args) {

			Response res=
					given()
					.contentType(ContentType.JSON)
					.when()
					.get("http://localhost:3000/MANIKapiBATCH"); 
			
			//get request for all the records 
		  /* extracting ALL  key value from response through org.json */
		  
		        JSONArray data = new JSONArray(res.asString());
		        int length=data.length();
		        for(int i=1;i<=length-1;i++)
		        {
		        	String data_extracted=data.getJSONObject(i).getString("id").toString();
		        	System.out.println("Data after Extractring :"+ "Object  "+i+"||  ....  "+data_extracted);
		        }
			
		}
		  

		
	}


