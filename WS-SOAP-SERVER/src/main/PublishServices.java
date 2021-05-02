package main;
import javax.xml.ws.Endpoint;

import implementacion.SOAPImplPet;
import implementacion.SOAPImplUser;

public class PublishServices {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8084/WS/Users", new SOAPImplUser());
		Endpoint.publish("http://localhost:8084/WS/Pets", new SOAPImplPet());
	}

}
