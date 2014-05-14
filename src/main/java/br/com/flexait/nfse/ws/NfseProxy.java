package br.com.flexait.nfse.ws;

public class NfseProxy implements br.com.flexait.nfse.ws.Nfse {
  private String _endpoint = null;
  private br.com.flexait.nfse.ws.Nfse nfse = null;
  
  public NfseProxy() {
    _initNfseProxy();
  }
  
  public NfseProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfseProxy();
  }
  
  private void _initNfseProxy() {
    try {
      nfse = (new br.com.flexait.nfse.ws.NfseWSServiceLocator()).getnfseSOAP();
      if (nfse != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfse)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfse != null)
      ((javax.xml.rpc.Stub)nfse)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.flexait.nfse.ws.Nfse getNfse() {
    if (nfse == null)
      _initNfseProxy();
    return nfse;
  }
  
  public br.com.flexait.nfse.ws.Output cancelarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.cancelarNfse(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output consultarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.consultarLoteRps(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output consultarNfseServicoPrestado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.consultarNfseServicoPrestado(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output consultarNfseServicoTomado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.consultarNfseServicoTomado(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output consultarNfsePorFaixa(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.consultarNfsePorFaixa(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output consultarNfsePorRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.consultarNfsePorRps(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output recepcionarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.recepcionarLoteRps(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output gerarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.gerarNfse(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output substituirNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.substituirNfse(parameters);
  }
  
  public br.com.flexait.nfse.ws.Output recepcionarLoteRpsSincrono(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException{
    if (nfse == null)
      _initNfseProxy();
    return nfse.recepcionarLoteRpsSincrono(parameters);
  }
  
  
}