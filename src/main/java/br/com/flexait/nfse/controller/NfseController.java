package br.com.flexait.nfse.controller;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import br.com.flexait.nfse.ws.Input;
import br.com.flexait.nfse.ws.Nfse;
import br.com.flexait.nfse.ws.NfseWSServiceLocator;
import br.com.flexait.nfse.ws.Output;

public class NfseController {

	public void consultar() throws RemoteException, ServiceException {
		NfseWSServiceLocator locator = new NfseWSServiceLocator();
		Nfse nfse = locator.getnfseSOAP();
		Input parameters = new Input();
		parameters.setNfseCabecMsg("");
		parameters.setNfseDadosMsg("");
		Output output = nfse.consultarLoteRps(parameters);
		System.out.println(output.getOutputXML());
	}
	
}
