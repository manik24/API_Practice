package API_deepak.API_deepak_9AM_POJO;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostrequestsimpleJsonusingpojo {

	public static void main(String[] args) {
		
		BasicInformation basic = new BasicInformation();
		basic.setFirstname("Manik");
		basic.setLastname("Kumar");
		basic.setEmail("manikc1234@gmail.com");
		basic.setPhone_number("99999232");
		basic.setAddress("chandigarh");
		
		Response res=
				
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post("http://localhost:3000/MANIKapiBATCH");
		
		System.out.println("Response "+ res.asString());
	}
	
}
