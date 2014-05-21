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

}