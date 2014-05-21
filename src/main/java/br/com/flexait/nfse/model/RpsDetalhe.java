package br.com.flexait.nfse.model;

import java.util.Calendar;
import java.util.UUID;

public class RpsDetalhe {

	private String Id;
	
	private IdentificacaoRps IdentificacaoRps;
	
	private Calendar DataEmissao;
	
	private Status status;

	public RpsDetalhe() {
		IdentificacaoRps = new IdentificacaoRps();
		Id = UUID.randomUUID().toString();
		status = Status.NORMAL;
		DataEmissao = Calendar.getInstance();
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public IdentificacaoRps getIdentificacaoRps() {
		return IdentificacaoRps;
	}

	public void setIdentificacaoRps(IdentificacaoRps identificacaoRps) {
		IdentificacaoRps = identificacaoRps;
	}
	
	public Calendar getDataEmissao() {
		return DataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		DataEmissao = dataEmissao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "RpsDetalhe [Id=" + Id + ", IdentificacaoRps="
				+ IdentificacaoRps + "]";
	}
	
}