package br.com.flexait.nfse.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.flexait.nfse.model.Contato;
import br.com.flexait.nfse.model.Endereco;
import br.com.flexait.nfse.model.Tomador;

public class TomadorBuilder {

	private final Tomador tomador;
	private static final Logger LOG = LoggerFactory.getLogger(TomadorBuilder.class);

	public TomadorBuilder() {
		tomador = new Tomador();
	}
	
	public Tomador build() {
		return tomador;
	}

	public TomadorBuilder withCpf(String string) {
		LOG.debug("Tomador: {}", string);
		
		tomador.getIdentificacaoTomador().getCpfCnpj().setCpf(string);
		return this;
	}

	public TomadorBuilder withEndereco(Endereco endereco) {
		tomador.setEndereco(endereco);
		return this;
	}

	public TomadorBuilder withRazaoSocial(String string) {
		LOG.debug("Tomador: {}", string);
		
		tomador.setRazaoSocial(string);
		return this;
	}

	public TomadorBuilder withContato(Contato contato) {
		LOG.debug("Tomador: {}", contato);
		
		tomador.setContato(contato);
		return this;
	}
	
}