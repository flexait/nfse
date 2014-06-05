package br.com.flexait.nfse.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.flexait.nfse.model.Prestador;

public class PrestadorBuilder {

	private static final Logger LOG = LoggerFactory.getLogger(Prestador.class);
	private Prestador prestador;
	
	public PrestadorBuilder() {
		prestador = new Prestador();
	}
	
	public Prestador build() {
		return prestador;
	}

	public PrestadorBuilder withCnpj(String string) {
		LOG.debug("Pretador: {}", string);
		
		prestador.getCpfCnpj().setCnpj(string);
		return this;
	}

}
