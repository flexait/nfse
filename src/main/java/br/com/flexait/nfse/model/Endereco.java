package br.com.flexait.nfse.model;

public class Endereco {

	private String Endereco;
	
	private Integer Numero;
	
	private String Complemento;
	
	private String Bairro;
	
	private Integer CodigoMunicipio;
	
	private String Uf;
	
	private String Cep;

	@Override
	public String toString() {
		return "Endereco [Endereco=" + Endereco + ", Numero=" + Numero
				+ ", Complemento=" + Complemento + ", Bairro=" + Bairro
				+ ", CodigoMunicipio=" + CodigoMunicipio + ", Uf=" + Uf
				+ ", Cep=" + Cep + "]";
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public Integer getNumero() {
		return Numero;
	}

	public void setNumero(Integer numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public String getBairro() {
		return Bairro;
	}

	public void setBairro(String bairro) {
		Bairro = bairro;
	}

	public Integer getCodigoMunicipio() {
		return CodigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		CodigoMunicipio = codigoMunicipio;
	}

	public String getUf() {
		return Uf;
	}

	public void setUf(String uf) {
		Uf = uf;
	}

	public String getCep() {
		return Cep;
	}

	public void setCep(String string) {
		Cep = string;
	}
	
}