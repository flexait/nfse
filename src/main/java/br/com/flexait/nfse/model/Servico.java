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

	public Servico(br.com.flexait.nfse.model.Valores valores, SimNao issRetido,
			String itemListaServico, Integer codigoCnae, String discriminacao,
			Integer codigoMunicipio,
			br.com.flexait.nfse.model.ExigibilidadeISS exigibilidadeISS,
			Integer municipioIncidencia) {
		Valores = valores;
		IssRetido = issRetido;
		ItemListaServico = itemListaServico;
		CodigoCnae = codigoCnae;
		Discriminacao = discriminacao;
		CodigoMunicipio = codigoMunicipio;
		ExigibilidadeISS = exigibilidadeISS;
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