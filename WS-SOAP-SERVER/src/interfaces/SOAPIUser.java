package interfaces;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import clases.User;

@WebService
public interface SOAPIUser {

	@WebMethod
	public List<User> getUsers();

	@WebMethod
	public void addUser(User user);
}
