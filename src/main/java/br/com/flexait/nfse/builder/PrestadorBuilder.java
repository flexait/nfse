package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.Prestador;

public class PrestadorBuilder {

	private Prestador prestador;
	
	public PrestadorBuilder() {
		prestador = new Prestador();
	}
	
	public Prestador build() {
		return prestador;
	}

	public PrestadorBuilder withCnpj(String string) {
		prestador.getCpfCnpj().setCnpj(string);
		return this;
	}

}
