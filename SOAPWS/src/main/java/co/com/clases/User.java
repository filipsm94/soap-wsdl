package co.com.clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	public static List<User> users = new ArrayList<>(Arrays.asList(
			new User(1, "Luis", "Aldana", "3215649871", "direccion 1"),
			new User(2, "Jonathan", "Garcia", "3215649872", "direccion 2"), 
			new User(3, "Felipe", "Mesa", "3215649873", "direccion 3"), 
			new User(4, "Cesar", "Yate", "3215649874", "direccion 4")
			)
		);

	public int code;
	public String firstName;
	public String lastName;
	public String mobile;
	public String direction;

	public User() {
		super();
	}

	public User(int code, String firstName, String lastName, String mobile, String direction) {
		super();
		this.code = code;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.direction = direction;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}

	public static List<User> getUsers() {
		return users;
	}

}