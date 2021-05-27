package API_deepak.API_deepak_9AM_POJO;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import net.minidev.json.JSONObject;

public class PostRequestComplexJsonUsingpojo {

public static void main(String[] args) {
	

	
	KYCclass obj2= new KYCclass();
	obj2.setCity("Chandigarh");
	obj2.setLandmark("Elante");
	obj2.setSector("Sctor 27");
	obj2.setPrimary_email("abc@abc.com");
	obj2.setSecondary_email("lol@lol.com");
		
		BasicInformation basic = new BasicInformation();
		basic.setFirstname("Manik");
		basic.setLastname("Kumar");
		basic.setEmail("manikc1234@gmail.com");
		basic.setPhone_number("99999232");
		basic.setAddress("chandigarh");
		basic.setKyc(obj2);
		
		
		
		Response res=
				
				given()
				.contentType(ContentType.JSON)
				.body(basic)
				.when()
				.post("http://localhost:3000/MANIKapiBATCH");
		
		System.out.println("Response "+ res.asString());
	}
}
