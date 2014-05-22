package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

public class Servico {

	private Valores Valores;
	
	private SimNao IssRetido;
	
	private String ItemListaServico;
	
	private Integer CodigoCnae;
	
	private String Discriminacao;
	
	private Integer CodigoMunicipio;
	
	@XStreamAlias("ExigibilidadeISS")
	private ExigibilidadeISS exigibilidadeISS;
	
	private Integer MunicipioIncidencia;

	public Servico() {
		Valores = new Valores();
		IssRetido = SimNao.NAO;
		exigibilidadeISS = ExigibilidadeISS.EXIGIVEL;
	}

	public Valores getValores() {
		return Valores;
	}

	public void setValores(Valores valores) {
		Valores = valores;
	}

	public SimNao getIssRetido() {
		return IssRetido;
	}

	public void setIssRetido(SimNao issRetido) {
		IssRetido = issRetido;
	}



	public String getItemListaServico() {
		return ItemListaServico;
	}

	public void setItemListaServico(String itemListaServico) {
		ItemListaServico = itemListaServico;
	}

	public Integer getCodigoCnae() {
		return CodigoCnae;
	}

	public void setCodigoCnae(Integer codigoCnae) {
		CodigoCnae = codigoCnae;
	}

	public String getDiscriminacao() {
		return Discriminacao;
	}

	public void setDiscriminacao(String discriminacao) {
		Discriminacao = discriminacao;
	}

	public Integer getCodigoMunicipio() {
		return CodigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		CodigoMunicipio = codigoMunicipio;
	}

	public ExigibilidadeISS getExigibilidadeISS() {
		return exigibilidadeISS;
	}

	public void setExigibilidadeISS(ExigibilidadeISS exigibilidadeISS) {
		this.exigibilidadeISS = exigibilidadeISS;
	}

	public Integer getMunicipioIncidencia() {
		return MunicipioIncidencia;
	}

	public void setMunicipioIncidencia(Integer municipioIncidencia) {
		MunicipioIncidencia = municipioIncidencia;
	}

	@Override
	public String toString() {
		return "Servico [Valores=" + Valores + ", IssRetido=" + IssRetido
				+ ", ItemListaServico=" + ItemListaServico + ", CodigoCnae="
				+ CodigoCnae + ", Discriminacao=" + Discriminacao
				+ ", CodigoMunicipio=" + CodigoMunicipio
				+ ", ExigibilidadeISS=" + this.exigibilidadeISS
				+ ", MunicipioIncidencia=" + MunicipioIncidencia + "]";
	}
	
}