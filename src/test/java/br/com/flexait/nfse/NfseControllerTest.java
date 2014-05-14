package br.com.flexait.nfse;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.controller.NfseController;

public class NfseControllerTest {

	NfseController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new NfseController();
	}

	@Test
	public void test() throws RemoteException, ServiceException {
		controller.consultar();
	}

}
