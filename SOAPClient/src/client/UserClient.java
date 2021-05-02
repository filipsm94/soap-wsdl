package client;

import implementacion.SOAPImplUserServiceLocator;
import interfaces.Pet;
import interfaces.SOAPIUser;
import interfaces.User;

public class UserClient {

	public static void main(String[] args) {
		SOAPImplUserServiceLocator locator = new SOAPImplUserServiceLocator();
		
		try {
			SOAPIUser userService = locator.getSOAPImplUserPort();
			showUsers(userService.getUsers());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void showUsers(User[] users) {
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].getCode() + " " + users[i].getFirstName() + " " + users[i].getLastName() + " " + users[i].getMobile() + " " + users[i].getDirection());
		}
	}

}
