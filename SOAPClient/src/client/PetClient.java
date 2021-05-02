package client;

import implementacion.SOAPImplPetServiceLocator;
import interfaces.Pet;
import interfaces.SOAPIPet;

public class PetClient {

	public static void main(String[] args) {
		SOAPImplPetServiceLocator locator = new SOAPImplPetServiceLocator();

		try {
			SOAPIPet petService = locator.getSOAPImplPetPort();
			
			System.out.println("Mascotas principales");
			showPets(petService.getPets());
			
			System.out.println("Se adiciona una nueva mascota");
			petService.addPet(new Pet(5,"totoi", "male","dog", 1));
			
			System.out.println("Despues de adicionar mascota");
			showPets(petService.getPets());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void showPets(Pet[] pets) {
		for(int i = 0; i < pets.length; i++) {
			System.out.println(pets[i].getCode() + " " + pets[i].getGender() + " " + pets[i].getName() + " " + pets[i].getType());
		}
	}

}
