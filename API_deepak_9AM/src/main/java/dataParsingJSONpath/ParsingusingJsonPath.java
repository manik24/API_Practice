package dataParsingJSONpath;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ParsingusingJsonPath {
	
	
	public static void main(String[] args) {
		        
		        Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/MANIKapiBATCH"); //get request for all the records 
												
				//SIngle value extracted  from response using JSON Path 
		        
		        String data =res.jsonPath().get("[3].Age");
		        System.out.println("Data is "+data);
				
				
		
	}
	
	
	

}
