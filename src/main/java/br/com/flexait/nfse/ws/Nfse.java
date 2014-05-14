/**
 * Nfse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.flexait.nfse.ws;

public interface Nfse extends java.rmi.Remote {
    public br.com.flexait.nfse.ws.Output cancelarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output consultarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output consultarNfseServicoPrestado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output consultarNfseServicoTomado(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output consultarNfsePorFaixa(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output consultarNfsePorRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output recepcionarLoteRps(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output gerarNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output substituirNfse(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
    public br.com.flexait.nfse.ws.Output recepcionarLoteRpsSincrono(br.com.flexait.nfse.ws.Input parameters) throws java.rmi.RemoteException;
}
