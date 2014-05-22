package br.com.flexait.nfse.model;

public class Tomador {
	
	private final IdentificacaoTomador IdentificacaoTomador;
	private Endereco Endereco;
	
	public Tomador() {
		IdentificacaoTomador = new IdentificacaoTomador();
		Endereco = new Endereco();
	}

	public Endereco getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.Endereco = endereco;
	}

	public IdentificacaoTomador getIdentificacaoTomador() {
		return IdentificacaoTomador;
	}

}
