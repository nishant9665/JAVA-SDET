package api_DynamicTest;

import java.util.ArrayList;

public class Root {
	public String firstName;
	public String lastName;
    public ArrayList<Address> address;
    
    public Root(String firstName, String lastName, ArrayList<Address> address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	public ArrayList<Address> getAddress() {
		return address;
	}
	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}
	
}
