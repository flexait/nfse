package br.com.flexait.nfse.model;

public class Tomador {
	
	private final IdentificacaoTomador IdentificacaoTomador;
	private String RazaoSocial;
	private Endereco Endereco;
	private Contato Contato;
	
	public Tomador() {
		IdentificacaoTomador = new IdentificacaoTomador();
		Endereco = new Endereco();
		Contato = new Contato();
	}

	public Endereco getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.Endereco = endereco;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public IdentificacaoTomador getIdentificacaoTomador() {
		return IdentificacaoTomador;
	}

	public Contato getContato() {
		return Contato;
	}

	public void setContato(Contato contato) {
		Contato = contato;
	}

}
