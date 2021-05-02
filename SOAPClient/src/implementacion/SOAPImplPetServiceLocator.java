/**
 * SOAPImplPetServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package implementacion;

public class SOAPImplPetServiceLocator extends org.apache.axis.client.Service implements implementacion.SOAPImplPetService {

    public SOAPImplPetServiceLocator() {
    }


    public SOAPImplPetServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPImplPetServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPImplPetPort
    private java.lang.String SOAPImplPetPort_address = "http://localhost:8080/WS/Pets";

    public java.lang.String getSOAPImplPetPortAddress() {
        return SOAPImplPetPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPImplPetPortWSDDServiceName = "SOAPImplPetPort";

    public java.lang.String getSOAPImplPetPortWSDDServiceName() {
        return SOAPImplPetPortWSDDServiceName;
    }

    public void setSOAPImplPetPortWSDDServiceName(java.lang.String name) {
        SOAPImplPetPortWSDDServiceName = name;
    }

    public interfaces.SOAPIPet getSOAPImplPetPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPImplPetPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPImplPetPort(endpoint);
    }

    public interfaces.SOAPIPet getSOAPImplPetPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            implementacion.SOAPImplPetPortBindingStub _stub = new implementacion.SOAPImplPetPortBindingStub(portAddress, this);
            _stub.setPortName(getSOAPImplPetPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPImplPetPortEndpointAddress(java.lang.String address) {
        SOAPImplPetPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (interfaces.SOAPIPet.class.isAssignableFrom(serviceEndpointInterface)) {
                implementacion.SOAPImplPetPortBindingStub _stub = new implementacion.SOAPImplPetPortBindingStub(new java.net.URL(SOAPImplPetPort_address), this);
                _stub.setPortName(getSOAPImplPetPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SOAPImplPetPort".equals(inputPortName)) {
            return getSOAPImplPetPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://implementacion/", "SOAPImplPetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://implementacion/", "SOAPImplPetPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPImplPetPort".equals(portName)) {
            setSOAPImplPetPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
