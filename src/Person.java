
public class Person {
	
	private String name;
	private String address;
	private double phone;
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Person(String name, String address, double phone, String email){

		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		
	}

}
