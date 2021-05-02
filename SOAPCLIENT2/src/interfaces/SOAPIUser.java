/**
 * SOAPIUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package interfaces;

public interface SOAPIUser extends java.rmi.Remote {
    public interfaces.User[] getUsers() throws java.rmi.RemoteException;
    public void addUser(interfaces.User arg0) throws java.rmi.RemoteException;
}
