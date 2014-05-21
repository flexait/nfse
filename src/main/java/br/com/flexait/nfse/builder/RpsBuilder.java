package br.com.flexait.nfse.builder;

import java.util.Calendar;

import br.com.flexait.nfse.model.IdentificacaoRps;
import br.com.flexait.nfse.model.InfDeclaracaoPrestacaoServico;
import br.com.flexait.nfse.model.Rps;
import br.com.flexait.nfse.model.RpsDetalhe;
import br.com.flexait.nfse.model.Status;
import br.com.flexait.nfse.model.Tipo;

public class RpsBuilder {
	
	private final Rps rps;
	
	private final InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico;
	
	private final RpsDetalhe rpsDetalhe;
	
	private final IdentificacaoRps identificacaoRps;

	protected RpsBuilder() {
		rps = new Rps();
		infDeclaracaoPrestacaoServico = new InfDeclaracaoPrestacaoServico();
		rpsDetalhe = new RpsDetalhe();
		identificacaoRps = new IdentificacaoRps();
	}
	
	public Rps build() {
		rpsDetalhe.setIdentificacaoRps(identificacaoRps);
		infDeclaracaoPrestacaoServico.setRps(rpsDetalhe);
		rps.setInfDeclaracaoPrestacaoServico(infDeclaracaoPrestacaoServico);
		return rps;
	}

	public RpsBuilder withInfId(String id) {
		infDeclaracaoPrestacaoServico.setId(id);
		return this;
	}
	
	public InfDeclaracaoPrestacaoServico getInf() {
		return infDeclaracaoPrestacaoServico;
	}

	public RpsBuilder withId(String id) {
		rpsDetalhe.setId(id);
		return this;
	}

	public RpsBuilder withData(Calendar dataEmissao) {
		rpsDetalhe.setDataEmissao(dataEmissao);
		return this;
	}

	public RpsBuilder normal() {
		rpsDetalhe.setStatus(Status.NORMAL);
		return this;
	}

	public RpsBuilder cancelado() {
		rpsDetalhe.setStatus(Status.CANCELADO);
		return this;
	}

	public RpsBuilder withNumero(long numero) {
		identificacaoRps.setNumero(numero);
		return this;
	}

	public RpsBuilder tipoRps() {
		identificacaoRps.setTipo(Tipo.RPS);
		return this;
	}

	public RpsBuilder tipoMista() {
		identificacaoRps.setTipo(Tipo.MISTA);
		return this;
	}

	public RpsBuilder tipoCupom() {
		identificacaoRps.setTipo(Tipo.CUPOM);
		return this;
	}

	public RpsBuilder withCompetencia(Calendar competencia) {
		infDeclaracaoPrestacaoServico.setCompetencia(competencia);
		return this;
	}

}
