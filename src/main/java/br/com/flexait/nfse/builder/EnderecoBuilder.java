package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.Endereco;

public class EnderecoBuilder {

	private final Endereco endereco;

	public EnderecoBuilder() {
		endereco = new Endereco();
	}
	
	public Endereco build() {
		return endereco;
	}

	public EnderecoBuilder withEndereco(String string) {
		endereco.setEndereco(string);
		return this;
	}

	public EnderecoBuilder withNumero(int i) {
		endereco.setNumero(i);
		return this;
	}

	public EnderecoBuilder withComplemento(String string) {
		endereco.setComplemento(string);
		return this;
	}

	public EnderecoBuilder withBairro(String string) {
		endereco.setBairro(string);
		return this;
	}

	public EnderecoBuilder withCodigoMunicipio(int i) {
		endereco.setCodigoMunicipio(i);
		return this;
	}

	public EnderecoBuilder withUf(String string) {
		endereco.setUf(string);
		return this;
	}

	public EnderecoBuilder withCep(int i) {
		endereco.setCep(i);
		return this;
	}

}