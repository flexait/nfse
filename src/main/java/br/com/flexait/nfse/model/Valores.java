package br.com.flexait.nfse.model;

public class Valores {

	private Double ValorServicos;
	
	private Double ValorDeducoes;
	
	private Double ValorPis;
	
	private Double ValorCofins;
	
	private Double ValorInss;
	
	private Double ValorIr;
	
	private Double ValorCsll;
	
	private Double OutrasRetencoes;
	
	private Double ValorIss;
	
	private Double Aliquota;
	
	private Double DescontoIncondicionado;
	
	private Double DescontoCondicionado;

	@Override
	public String toString() {
		return "Valores [ValorServicos=" + ValorServicos + ", ValorDeducoes="
				+ ValorDeducoes + ", ValorPis=" + ValorPis + ", ValorCofins="
				+ ValorCofins + ", ValorInss=" + ValorInss + ", ValorIr="
				+ ValorIr + ", ValorCsll=" + ValorCsll + ", OutrasRetencoes="
				+ OutrasRetencoes + ", ValorIss=" + ValorIss + ", Aliquota="
				+ Aliquota + ", DescontoIncondicionado="
				+ DescontoIncondicionado + ", DescontoCondicionado="
				+ DescontoCondicionado + "]";
	}

	public Double getValorServicos() {
		return ValorServicos;
	}

	public void setValorServicos(Double valorServicos) {
		ValorServicos = valorServicos;
	}

	public Double getValorDeducoes() {
		return ValorDeducoes;
	}

	public void setValorDeducoes(Double valorDeducoes) {
		ValorDeducoes = valorDeducoes;
	}

	public Double getValorPis() {
		return ValorPis;
	}

	public void setValorPis(Double valorPis) {
		ValorPis = valorPis;
	}

	public Double getValorCofins() {
		return ValorCofins;
	}

	public void setValorCofins(Double valorCofins) {
		ValorCofins = valorCofins;
	}

	public Double getValorInss() {
		return ValorInss;
	}

	public void setValorInss(Double valorInss) {
		ValorInss = valorInss;
	}

	public Double getValorIr() {
		return ValorIr;
	}

	public void setValorIr(Double valorIr) {
		ValorIr = valorIr;
	}

	public Double getValorCsll() {
		return ValorCsll;
	}

	public void setValorCsll(Double valorCsll) {
		ValorCsll = valorCsll;
	}

	public Double getOutrasRetencoes() {
		return OutrasRetencoes;
	}

	public void setOutrasRetencoes(Double outrasRetencoes) {
		OutrasRetencoes = outrasRetencoes;
	}

	public Double getValorIss() {
		return ValorIss;
	}

	public void setValorIss(Double valorIss) {
		ValorIss = valorIss;
	}

	public Double getAliquota() {
		return Aliquota;
	}

	public void setAliquota(Double aliquota) {
		Aliquota = aliquota;
	}

	public Double getDescontoIncondicionado() {
		return DescontoIncondicionado;
	}

	public void setDescontoIncondicionado(Double descontoIncondicionado) {
		DescontoIncondicionado = descontoIncondicionado;
	}

	public Double getDescontoCondicionado() {
		return DescontoCondicionado;
	}

	public void setDescontoCondicionado(Double descontoCondicionado) {
		DescontoCondicionado = descontoCondicionado;
	}
	
}