package abstraction;

public class Encapsulation {
	
	private String username, password;
	
	public void setUserName(String username) {
		this.username=username;
	}
	
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getUserName() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	

}


/*
Encapsulation:

Declaring all the variables as private and writing public methods in the class to set and get the values of private variables.



*/