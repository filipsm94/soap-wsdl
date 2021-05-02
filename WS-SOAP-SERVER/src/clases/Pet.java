package clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pet implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static List<Pet> pets = new ArrayList<>(Arrays.asList(
			new Pet(1,"kira", "female","cat", 1),
			new Pet(2,"kaysa", "female","dog", 2),
			new Pet(3,"motas", "female","cat", 3),
			new Pet(4,"keyko", "male","cat", 4)
			));
	
	public int code;
	public String name;
	public String gender;
	public String type;
	public int owner;
	
	public Pet() {
		super();
	}
	
	public Pet(int code, String name, String gender, String type, int owner) {
		super();
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.type = type;
		this.owner = owner;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setOwner(int owner) {
		this.owner = owner;
	}
	
	public static List<Pet> getPets(){
		return pets;
	}
}
