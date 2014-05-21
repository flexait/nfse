package br.com.flexait.nfse.model;

public class IdentificacaoRps {

	private Long Numero;
	
	private Serie serie;
	
	private Tipo tipo;

	public IdentificacaoRps() {
		serie = Serie.NFE;
		tipo = Tipo.RPS;
	}

	public Long getNumero() {
		return Numero;
	}

	public void setNumero(Long numero) {
		Numero = numero;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "IdentificacaoRps [Numero=" + Numero + ", Serie=" + serie
				+ ", Tipo=" + tipo + "]";
	}
	
}