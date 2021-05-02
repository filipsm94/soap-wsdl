/**
 * SOAPImplUserServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package implementacion;

public class SOAPImplUserServiceLocator extends org.apache.axis.client.Service implements implementacion.SOAPImplUserService {

    public SOAPImplUserServiceLocator() {
    }


    public SOAPImplUserServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SOAPImplUserServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SOAPImplUserPort
    private java.lang.String SOAPImplUserPort_address = "http://localhost:8080/WS/Users";

    public java.lang.String getSOAPImplUserPortAddress() {
        return SOAPImplUserPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SOAPImplUserPortWSDDServiceName = "SOAPImplUserPort";

    public java.lang.String getSOAPImplUserPortWSDDServiceName() {
        return SOAPImplUserPortWSDDServiceName;
    }

    public void setSOAPImplUserPortWSDDServiceName(java.lang.String name) {
        SOAPImplUserPortWSDDServiceName = name;
    }

    public interfaces.SOAPIUser getSOAPImplUserPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SOAPImplUserPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSOAPImplUserPort(endpoint);
    }

    public interfaces.SOAPIUser getSOAPImplUserPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            implementacion.SOAPImplUserPortBindingStub _stub = new implementacion.SOAPImplUserPortBindingStub(portAddress, this);
            _stub.setPortName(getSOAPImplUserPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSOAPImplUserPortEndpointAddress(java.lang.String address) {
        SOAPImplUserPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (interfaces.SOAPIUser.class.isAssignableFrom(serviceEndpointInterface)) {
                implementacion.SOAPImplUserPortBindingStub _stub = new implementacion.SOAPImplUserPortBindingStub(new java.net.URL(SOAPImplUserPort_address), this);
                _stub.setPortName(getSOAPImplUserPortWSDDServiceName());
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
        if ("SOAPImplUserPort".equals(inputPortName)) {
            return getSOAPImplUserPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://implementacion/", "SOAPImplUserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://implementacion/", "SOAPImplUserPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SOAPImplUserPort".equals(portName)) {
            setSOAPImplUserPortEndpointAddress(address);
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
