package interfaces;

public class SOAPIUserProxy implements interfaces.SOAPIUser {
  private String _endpoint = null;
  private interfaces.SOAPIUser sOAPIUser = null;
  
  public SOAPIUserProxy() {
    _initSOAPIUserProxy();
  }
  
  public SOAPIUserProxy(String endpoint) {
    _endpoint = endpoint;
    _initSOAPIUserProxy();
  }
  
  private void _initSOAPIUserProxy() {
    try {
      sOAPIUser = (new implementacion.SOAPImplUserServiceLocator()).getSOAPImplUserPort();
      if (sOAPIUser != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sOAPIUser)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sOAPIUser)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sOAPIUser != null)
      ((javax.xml.rpc.Stub)sOAPIUser)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public interfaces.SOAPIUser getSOAPIUser() {
    if (sOAPIUser == null)
      _initSOAPIUserProxy();
    return sOAPIUser;
  }
  
  public interfaces.User[] getUsers() throws java.rmi.RemoteException{
    if (sOAPIUser == null)
      _initSOAPIUserProxy();
    return sOAPIUser.getUsers();
  }
  
  public void addUser(interfaces.User arg0) throws java.rmi.RemoteException{
    if (sOAPIUser == null)
      _initSOAPIUserProxy();
    sOAPIUser.addUser(arg0);
  }
  
  
}