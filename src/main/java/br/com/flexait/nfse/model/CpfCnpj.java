package br.com.flexait.nfse.model;

public class CpfCnpj {
	
	private String Cnpj;
	
	private String Cpf;
	
	public CpfCnpj(String cnpj, String cpf) {
		super();
		Cnpj = cnpj;
		Cpf = cpf;
	}
	
	public CpfCnpj(String cnpj) {
		super();
		Cnpj = cnpj;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public String getCpf() {
		return Cpf;
	}

	@Override
	public String toString() {
		return "CpfCnpj [Cnpj=" + Cnpj + ", Cpf=" + Cpf + "]";
	}
	
}