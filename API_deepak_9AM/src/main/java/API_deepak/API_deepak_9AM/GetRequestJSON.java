package API_deepak.API_deepak_9AM;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

public class GetRequestJSON {

	public static void main(String[] args)
	{
			
			
			Response res=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/MANIKapiBATCH"); //get request for all the records 
			
			Response res1=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/MANIKapiBATCH/M102"); //get request using path parameter(path used is id here)
			
			Response res2=
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/MANIKapiBATCH?First Name=Test"); //get request using path parameter(path used is id here)
										
			
			
			System.out.println("Data for all the records is  :"+res.asString());
			System.out.println("---------------------------------------------------");
			System.out.println("Data for all the path parameter is  :"+res1.asString());
			System.out.println("---------------------------------------------------");
			System.out.println("Data for all the query parameter is  :"+res2.asString());
			
			
			
		}

}
