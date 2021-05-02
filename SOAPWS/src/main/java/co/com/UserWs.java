/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com;

import co.com.clases.User;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author User
 */
@WebService(serviceName = "UserWs")
public class UserWs {

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "getUsers")
    public List<User> getUsers() {
        return User.getUsers();
    }

    /**
     * Web service operation
     * @param user
     */
    @WebMethod(operationName = "adduser")
    public void adduser(@WebParam(name = "user") User user) {
        User.getUsers().add(user);
    }
}
