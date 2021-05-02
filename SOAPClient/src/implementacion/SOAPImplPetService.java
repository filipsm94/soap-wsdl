/**
 * SOAPImplPetService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package implementacion;

public interface SOAPImplPetService extends javax.xml.rpc.Service {
    public java.lang.String getSOAPImplPetPortAddress();

    public interfaces.SOAPIPet getSOAPImplPetPort() throws javax.xml.rpc.ServiceException;

    public interfaces.SOAPIPet getSOAPImplPetPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
