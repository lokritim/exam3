package main;

public class Customer {
	
	
	private String name;
	private int age;
	private String ssn; 
	private String address; 
	private String city;
	private long zipcode;
	
	
	
	public Customer(String name, int age, String ssn, String address, String city, long zipcode) {
		super();
		this.name = name;
		this.age = age;
		this.ssn = ssn;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", city=" + city
				+ ", zipcode=" + zipcode + "]";
	}
	
	
	

}
