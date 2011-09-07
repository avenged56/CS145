package friendslist;

public class Friend {

	private String firstName;
	private String lastName;
	
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
	
	public Friend(String name, String name2) {
		super();
		// TODO Auto-generated constructor stub
		firstName = name;
		lastName = name2;
	}
	
	public String toString() {
		return lastName + ", " + firstName;
	}
}
