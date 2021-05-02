package implementacion;

import java.util.List;

import javax.jws.WebService;

import clases.Pet;
import interfaces.SOAPIPet;

@WebService(endpointInterface = "interfaces.SOAPIPet")
public class SOAPImplPet implements  SOAPIPet {

	@Override
	public List<Pet> getPets() {
		return Pet.getPets();
	}

	@Override
	public void addPet(Pet pet) {
		Pet.getPets().add(pet);
	}
}
