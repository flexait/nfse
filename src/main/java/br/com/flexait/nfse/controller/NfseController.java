package br.com.flexait.nfse.controller;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class NfseController extends JApplet {

	private static final long serialVersionUID = -820983556901220474L;

	public NfseController() {
		System.out.println("#foo bar");
	}
	
	public void init() {
		System.out.println("### init");
	}
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(new NfseController(), "foo");
	}
	
	public void consultar() {
//		Nfse nfse = new NfseWSServiceLocator().getnfseSOAP();
//		Input parameters = new Input();
//		parameters.setNfseCabecMsg("");
//		parameters.setNfseDadosMsg("");
//		Output output = nfse.consultarLoteRps(parameters);
//		System.out.println(output.getOutputXML());
	}
	
}
