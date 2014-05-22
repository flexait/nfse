package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.Endereco;
import br.com.flexait.nfse.model.Tomador;

public class TomadorBuilder {

	private final Tomador tomador;

	public TomadorBuilder() {
		tomador = new Tomador();
	}
	
	public Tomador build() {
		return tomador;
	}

	public TomadorBuilder withCpf(String string) {
		tomador.getIdentificacaoTomador().getCpfCnpj().setCpf(string);
		return this;
	}

	public TomadorBuilder withEndereco(Endereco endereco) {
		tomador.setEndereco(endereco);
		return this;
	}
	
}