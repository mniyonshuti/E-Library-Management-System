package business;

import java.io.Serializable;

public abstract class Person implements Serializable {
	

	private static final long serialVersionUID = -2615394552793016692L;
	private String firstName;
	private String lastName;
	private String phone;
	private Address address;
	
	public Person(String firstName, String lastName, String phone, Address address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	public Person(){
		
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return firstName + ", " + 
			   lastName + "/n"+ 
			   address;
	}


}
