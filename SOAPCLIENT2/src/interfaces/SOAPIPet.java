/**
 * SOAPIPet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package interfaces;

public interface SOAPIPet extends java.rmi.Remote {
    public void addPet(interfaces.Pet arg0) throws java.rmi.RemoteException;
    public interfaces.Pet[] getPets() throws java.rmi.RemoteException;
}
