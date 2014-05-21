package br.com.flexait.nfse.model;

import java.util.Calendar;
import java.util.UUID;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class InfDeclaracaoPrestacaoServico {

	@XStreamAsAttribute
	private String Id;
	
	private RpsDetalhe Rps;
	
	private Calendar Competencia;
	
	private Servico Servico;
	
	private Prestador Prestador;
	
	private Tomador Tomador;
	
	private Intermediario Intermediario;

	private SimNao OptanteSimplesNacional;
	
	private SimNao IncentivoFiscal;
	
	public InfDeclaracaoPrestacaoServico() {
		Rps = new RpsDetalhe();
		Id = UUID.randomUUID().toString();
		Competencia = Calendar.getInstance();
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public RpsDetalhe getRps() {
		return Rps;
	}

	public void setRps(RpsDetalhe rps) {
		Rps = rps;
	}

	public Calendar getCompetencia() {
		return Competencia;
	}

	public void setCompetencia(Calendar competencia) {
		Competencia = competencia;
	}

	public Servico getServico() {
		return Servico;
	}

	public void setServico(Servico servico) {
		Servico = servico;
	}

	public Prestador getPrestador() {
		return Prestador;
	}

	public void setPrestador(Prestador prestador) {
		Prestador = prestador;
	}

	public Tomador getTomador() {
		return Tomador;
	}

	public void setTomador(Tomador tomador) {
		Tomador = tomador;
	}

	public Intermediario getIntermediario() {
		return Intermediario;
	}

	public void setIntermediario(Intermediario intermediario) {
		Intermediario = intermediario;
	}

	public SimNao getOptanteSimplesNacional() {
		return OptanteSimplesNacional;
	}

	public void setOptanteSimplesNacional(SimNao optanteSimplesNacional) {
		OptanteSimplesNacional = optanteSimplesNacional;
	}

	public SimNao getIncentivoFiscal() {
		return IncentivoFiscal;
	}

	public void setIncentivoFiscal(SimNao incentivoFiscal) {
		IncentivoFiscal = incentivoFiscal;
	}

	@Override
	public String toString() {
		return "InfDeclaracaoPrestacaoServico [Id=" + Id + ", Rps=" + Rps
				+ ", Competencia=" + Competencia + ", Servico=" + Servico
				+ ", Prestador=" + Prestador + ", Tomador=" + Tomador
				+ ", Intermediario=" + Intermediario
				+ ", OptanteSimplesNacional=" + OptanteSimplesNacional
				+ ", IncentivoFiscal=" + IncentivoFiscal + "]";
	}

}
