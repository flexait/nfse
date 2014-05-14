/**
 * NfseWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.flexait.nfse.ws;

public class NfseWSServiceLocator extends org.apache.axis.client.Service implements br.com.flexait.nfse.ws.NfseWSService {

    public NfseWSServiceLocator() {
    }


    public NfseWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NfseWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for nfseSOAP
    private java.lang.String nfseSOAP_address = "http://ws.pbh.gov.br";

    public java.lang.String getnfseSOAPAddress() {
        return nfseSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String nfseSOAPWSDDServiceName = "nfseSOAP";

    public java.lang.String getnfseSOAPWSDDServiceName() {
        return nfseSOAPWSDDServiceName;
    }

    public void setnfseSOAPWSDDServiceName(java.lang.String name) {
        nfseSOAPWSDDServiceName = name;
    }

    public br.com.flexait.nfse.ws.Nfse getnfseSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(nfseSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getnfseSOAP(endpoint);
    }

    public br.com.flexait.nfse.ws.Nfse getnfseSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.flexait.nfse.ws.NfseSOAPStub _stub = new br.com.flexait.nfse.ws.NfseSOAPStub(portAddress, this);
            _stub.setPortName(getnfseSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setnfseSOAPEndpointAddress(java.lang.String address) {
        nfseSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.flexait.nfse.ws.Nfse.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.flexait.nfse.ws.NfseSOAPStub _stub = new br.com.flexait.nfse.ws.NfseSOAPStub(new java.net.URL(nfseSOAP_address), this);
                _stub.setPortName(getnfseSOAPWSDDServiceName());
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
        if ("nfseSOAP".equals(inputPortName)) {
            return getnfseSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "NfseWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nfse.abrasf.org.br", "nfseSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("nfseSOAP".equals(portName)) {
            setnfseSOAPEndpointAddress(address);
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
