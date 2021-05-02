package implementacion;

import java.util.List;

import javax.jws.WebService;

import clases.User;
import interfaces.SOAPIUser;

@WebService(endpointInterface = "interfaces.SOAPIUser")
public class SOAPImplUser implements SOAPIUser {

	@Override
	public List<User> getUsers() {
		return User.getUsers();
	}
	
	@Override
	public void addUser(User user) {
		User.getUsers().add(user);
	}

}
