package br.com.flexait.nfse.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class LoteRps {
	
	@XStreamAsAttribute
	private String Id;
	
	@XStreamAsAttribute
	private Versao versao;
	
	private Long NumeroLote;
	
	private CpfCnpj CpfCnpj;
	
	private String InscricaoMunicipal;
	
	private int QuantidadeRps;
	
	private final List<ListaRps> ListaRps;
	
	public LoteRps() {
		Id = UUID.randomUUID().toString();
		ListaRps = new ArrayList<>();
		versao = Versao.V2_01;
	}

	@Override
	public String toString() {
		return "LoteRps [Id=" + Id + ", versao=" + versao + ", NumeroLote="
				+ NumeroLote + ", CpfCnpj=" + CpfCnpj + ", InscricaoMunicipal="
				+ InscricaoMunicipal + ", QuantidadeRps=" + QuantidadeRps
				+ ", ListaRps=" + ListaRps + "]";
	}

	public void setId(String id) {
		Id = id;
	}

	public String getId() {
		return Id;
	}

	public Versao getVersao() {
		return versao;
	}

	public void setVersao(Versao versao) {
		this.versao = versao;
	}

	public Long getNumeroLote() {
		return NumeroLote;
	}

	public void setNumeroLote(Long numeroLote) {
		NumeroLote = numeroLote;
	}

	public CpfCnpj getCpfCnpj() {
		return CpfCnpj;
	}

	public void setCpfCnpj(CpfCnpj cpfCnpj) {
		CpfCnpj = cpfCnpj;
	}

	public String getInscricaoMunicipal() {
		return InscricaoMunicipal;
	}

	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		InscricaoMunicipal = inscricaoMunicipal;
	}

	public Integer getQuantidadeRps() {
		return QuantidadeRps;
	}

	public List<ListaRps> getListaRps() {
		return Collections.unmodifiableList(ListaRps);
	}

	public void addRps(List<ListaRps> rps) {
		ListaRps.addAll(rps);
		QuantidadeRps = ListaRps.size();
	}

	public void setCnpj(String cnpj) {
		// TODO Auto-generated method stub
		
	}

	public void addRps(ListaRps[] rps) {
		// TODO Auto-generated method stub
		
	}

	public void v2_02() {
		// TODO Auto-generated method stub
		
	}

	public void v2_01() {
		// TODO Auto-generated method stub
		
	}

}