package br.com.flexait.nfse.model;

public class IdentificacaoTomador {
	
	private CpfCnpj CpfCnpj;
	
	public IdentificacaoTomador() {
		CpfCnpj = new CpfCnpj();
	}

	public CpfCnpj getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}

	@Override
	public String toString() {
		return "IdentificacaoTomador [CpfCnpj=" + CpfCnpj + "]";
	}
	
}
