/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ws;

import co.com.clases.Pet;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "PetsWs")
public class PetsWs {

    @WebMethod(operationName = "getPet")
    public List<Pet> getPet() {
        return Pet.getPets();
    }

    /**
     * Web service operation
     * @param pet
     */
    @WebMethod(operationName = "addPet")
    public void addPet(@WebParam(name = "Pet") Pet pet) {
        Pet.getPets().add(pet);
    }
}
