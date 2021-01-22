package API_deepak.API_deepak_9AM_POJO;

public class BasicInformation 
{
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String Phone_number;
	private KYCclass kyc;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public KYCclass getKyc() {
		return kyc;
	}
	public void setKyc(KYCclass kyc) {
		this.kyc = kyc;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(String phone_number) {
		Phone_number = phone_number;
	}
	

}
