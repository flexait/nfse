/**
 * NfseWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.flexait.nfse.ws;

public interface NfseWSService extends javax.xml.rpc.Service {
    public java.lang.String getnfseSOAPAddress();

    public br.com.flexait.nfse.ws.Nfse getnfseSOAP() throws javax.xml.rpc.ServiceException;

    public br.com.flexait.nfse.ws.Nfse getnfseSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
