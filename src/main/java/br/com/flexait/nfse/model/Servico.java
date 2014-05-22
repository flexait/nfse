package br.com.flexait.nfse.model;

public class Servico {

	private Valores Valores;
	
	private SimNao IssRetido;
	
	private String ItemListaServico;
	
	private Integer CodigoCnae;
	
	private String Discriminacao;
	
	private Integer CodigoMunicipio;
	
	private ExigibilidadeISS ExigibilidadeISS;
	
	private Integer MunicipioIncidencia;

	public Servico() {
		Valores = new Valores();
		IssRetido = SimNao.NAO;
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
		return ExigibilidadeISS;
	}

	public void setExigibilidadeISS(ExigibilidadeISS exigibilidadeISS) {
		ExigibilidadeISS = exigibilidadeISS;
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
				+ ", ExigibilidadeISS=" + ExigibilidadeISS
				+ ", MunicipioIncidencia=" + MunicipioIncidencia + "]";
	}
	
}