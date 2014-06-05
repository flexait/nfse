package br.com.flexait.nfse.builder;

import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.flexait.nfse.converter.DateConverter;
import br.com.flexait.nfse.model.IdentificacaoRps;
import br.com.flexait.nfse.model.InfDeclaracaoPrestacaoServico;
import br.com.flexait.nfse.model.Prestador;
import br.com.flexait.nfse.model.Rps;
import br.com.flexait.nfse.model.RpsDetalhe;
import br.com.flexait.nfse.model.Servico;
import br.com.flexait.nfse.model.SimNao;
import br.com.flexait.nfse.model.Status;
import br.com.flexait.nfse.model.Tipo;
import br.com.flexait.nfse.model.Tomador;

public class RpsBuilder {
	
	private static final Logger LOG = LoggerFactory.getLogger(RpsBuilder.class);
	
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
		LOG.debug("Emissão: {}", convertDate(dataEmissao));
		
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
		LOG.debug("RPS: {}", numero);
		
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
		LOG.debug("Competência: {}", convertDate(competencia));
		
		infDeclaracaoPrestacaoServico.setCompetencia(competencia);
		return this;
	}

	private String convertDate(Calendar date) {
		return new DateConverter().toString(date);
	}

	public RpsBuilder withServico(Servico servico) {
		infDeclaracaoPrestacaoServico.setServico(servico);
		return this;
	}

	public RpsBuilder withPrestador(Prestador prestador) {
		infDeclaracaoPrestacaoServico.setPrestador(prestador);
		return this;
	}

	public RpsBuilder withTomador(Tomador tomador) {
		infDeclaracaoPrestacaoServico.setTomador(tomador);
		return this;
	}

	public RpsBuilder optanteSimplesNacional() {
		infDeclaracaoPrestacaoServico.setOptanteSimplesNacional(SimNao.SIM);
		return this;
	}
	
	public RpsBuilder naoOptanteSimplesNacional() {
		infDeclaracaoPrestacaoServico.setOptanteSimplesNacional(SimNao.NAO);
		return this;
	}

	public RpsBuilder comIncentivoFiscal() {
		infDeclaracaoPrestacaoServico.setIncentivoFiscal(SimNao.SIM);
		return this;
	}

	public RpsBuilder semIncentivoFiscal() {
		infDeclaracaoPrestacaoServico.setIncentivoFiscal(SimNao.NAO);
		return this;
	}

}
