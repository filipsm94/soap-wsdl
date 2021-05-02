package interfaces;

public class SOAPIPetProxy implements interfaces.SOAPIPet {
  private String _endpoint = null;
  private interfaces.SOAPIPet sOAPIPet = null;
  
  public SOAPIPetProxy() {
    _initSOAPIPetProxy();
  }
  
  public SOAPIPetProxy(String endpoint) {
    _endpoint = endpoint;
    _initSOAPIPetProxy();
  }
  
  private void _initSOAPIPetProxy() {
    try {
      sOAPIPet = (new implementacion.SOAPImplPetServiceLocator()).getSOAPImplPetPort();
      if (sOAPIPet != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOAPIPet)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOAPIPet)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOAPIPet != null)
      ((javax.xml.rpc.Stub)sOAPIPet)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public interfaces.SOAPIPet getSOAPIPet() {
    if (sOAPIPet == null)
      _initSOAPIPetProxy();
    return sOAPIPet;
  }
  
  public void addPet(interfaces.Pet arg0) throws java.rmi.RemoteException{
    if (sOAPIPet == null)
      _initSOAPIPetProxy();
    sOAPIPet.addPet(arg0);
  }
  
  public interfaces.Pet[] getPets() throws java.rmi.RemoteException{
    if (sOAPIPet == null)
      _initSOAPIPetProxy();
    return sOAPIPet.getPets();
  }
  
  
}