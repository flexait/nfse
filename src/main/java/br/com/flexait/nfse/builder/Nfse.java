package br.com.flexait.nfse.builder;

import java.util.List;

import br.com.flexait.nfse.model.ListaRps;
import br.com.flexait.nfse.model.LoteRps;
import br.com.flexait.nfse.model.Rps;

public class Nfse {

	private final NfseBuilder nfseBuilder;
	
	private final RpsBuilder rpsBuilder;
	
	private final LoteRps loteRps;
	
	protected Nfse() {
		nfseBuilder = new NfseBuilder();
		rpsBuilder = new RpsBuilder();
		loteRps = new LoteRps();
	}

	public static Nfse build() {
		return new Nfse();
	}

	public String asXML() {
		return nfseBuilder.build();
	}

	public Nfse withLoteId(String id) {
		loteRps.setId(id);
		return this;
	}

	public Nfse withNumeroLote(Long numero) {
		loteRps.setNumeroLote(numero);
		return this;
	}

	public Nfse withCnpj(String cnpj) {
		loteRps.setCnpj(cnpj);
		return this;
	}

	public Nfse withInscricaoMunicipal(String inscricaoMunicipal) {
		loteRps.setInscricaoMunicipal(inscricaoMunicipal);
		return this;
	}

	public Nfse addRps(List<ListaRps> rps) {
		loteRps.addRps(rps);
		return this;
	}

	public Nfse addRps(ListaRps... rps) {
		loteRps.addRps(rps);
		return this;
	}

	public Nfse v2_02() {
		loteRps.v2_02();
		return this;
	}

	public Nfse v2_01() {
		loteRps.v2_01();
		return this;
	}

	public Rps rps() {
		return null;
	}
	
}