package interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import clases.Pet;

@WebService
public interface SOAPIPet {

	@WebMethod
	public List<Pet> getPets();
	
	@WebMethod
	public void addPet(Pet pet);
}
