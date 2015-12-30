package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.Contato;

public class ContatoBuilder {

	private final Contato contato;

	public ContatoBuilder() {
		this.contato = new Contato();
	}
	
	public Contato build() {
		return contato;
	}

	public ContatoBuilder withEmail(String email) {
		contato.setEmail(email);
		return this;
	}

	public ContatoBuilder withTelefone(String telefone) {
		contato.setTelefone(telefone);
		return this;
	}
	
}
