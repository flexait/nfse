package br.com.flexait.nfse.model;

public class Prestador {
	
	private CpfCnpj CpfCnpj;
	
	public Prestador() {
		CpfCnpj = new CpfCnpj();
	}

	public CpfCnpj getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}
	
}
