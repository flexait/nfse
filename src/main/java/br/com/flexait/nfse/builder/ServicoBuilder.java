package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.ExigibilidadeISS;
import br.com.flexait.nfse.model.Servico;
import br.com.flexait.nfse.model.SimNao;

public class ServicoBuilder {

	private final Servico servico;

	public ServicoBuilder() {
		servico = new Servico();
	}
	
	public ServicoBuilder withValorServicos(double valor) {
		servico.getValores().setValorServicos(valor);
		return this;
	}

	public Servico build() {
		return servico;
	}

	public ServicoBuilder withValorDeducoes(double valor) {
		servico.getValores().setValorDeducoes(valor);
		return this;
	}

	public ServicoBuilder withValorPis(double d) {
		servico.getValores().setValorPis(d);
		return this;
	}

	public ServicoBuilder withValorCofins(double d) {
		servico.getValores().setValorCofins(d);
		return this;
	}

	public ServicoBuilder withValorInss(double d) {
		servico.getValores().setValorInss(d);
		return this;
	}

	public ServicoBuilder withValorIr(double d) {
		servico.getValores().setValorIr(d);
		return this;
	}

	public ServicoBuilder withOutrasRetencoes(double d) {
		servico.getValores().setOutrasRetencoes(d);
		return this;
	}

	public ServicoBuilder withValorCsll(double d) {
		servico.getValores().setValorCsll(d);
		return this;
	}

	public ServicoBuilder withValorIss(double d) {
		servico.getValores().setValorIss(d);
		return this;
	}

	public ServicoBuilder withAliquota(double d) {
		servico.getValores().setAliquota(d);
		return this;
	}

	public ServicoBuilder withDescontoIncondicionado(double d) {
		servico.getValores().setDescontoIncondicionado(d);
		return this;
	}

	public ServicoBuilder withDescontoCondicionado(double d) {
		servico.getValores().setDescontoCondicionado(d);
		return this;
	}

	public ServicoBuilder issRetido() {
		servico.setIssRetido(SimNao.SIM);
		return this;
	}
	
	public ServicoBuilder issNaoRetido() {
		servico.setIssRetido(SimNao.NAO);
		return this;
	}

	public ServicoBuilder withItemListaServico(String string) {
		servico.setItemListaServico(string);
		return this;
	}

	public ServicoBuilder withCodigoMunicipio(int i) {
		servico.setCodigoMunicipio(i);
		return this;
	}

	public ServicoBuilder withExigibilidadeISS(ExigibilidadeISS exigivel) {
		servico.setExigibilidadeISS(exigivel);
		return this;
	}

	public ServicoBuilder withMunicipioIncidencia(int i) {
		servico.setMunicipioIncidencia(i);
		return this;
	}

	public ServicoBuilder withCodigoCnae(int i) {
		servico.setCodigoCnae(i);
		return this;
	}

	public ServicoBuilder withDiscriminacao(String s) {
		servico.setDiscriminacao(s);
		return this;
	}

}
