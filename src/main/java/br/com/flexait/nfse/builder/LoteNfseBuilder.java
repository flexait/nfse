package br.com.flexait.nfse.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.flexait.nfse.model.LoteRps;
import br.com.flexait.nfse.model.Rps;

public class LoteNfseBuilder {

	private final LoteRps loteRps;
	private final List<Rps> listRps;
	
	public LoteNfseBuilder() {
		loteRps = new LoteRps();
		listRps = new ArrayList<>();
	}

	public LoteRps build() {
		loteRps.addRps(listRps);
		return loteRps;
	}

	public LoteNfseBuilder withIdLote(String id) {
		loteRps.setId(id);
		return this;
	}

	public LoteNfseBuilder withNumeroLote(Long numero) {
		loteRps.setNumeroLote(numero);
		return this;
	}

	public LoteNfseBuilder withCnpj(String cnpj) {
		loteRps.setCnpj(cnpj);
		return this;
	}

	public LoteNfseBuilder withInscricaoMunicipal(String inscricaoMunicipal) {
		loteRps.setInscricaoMunicipal(inscricaoMunicipal);
		return this;
	}

	public LoteNfseBuilder v2_02() {
		loteRps.v2_02();
		return this;
	}

	public LoteNfseBuilder v2_01() {
		loteRps.v2_01();
		return this;
	}

	public LoteNfseBuilder addRps(Rps... rps) {
		addRps(Arrays.asList(rps));
		return this;
	}

	public LoteNfseBuilder addRps(List<Rps> gerarListaRps) {
		listRps.addAll(gerarListaRps);
		return this;
	}

}