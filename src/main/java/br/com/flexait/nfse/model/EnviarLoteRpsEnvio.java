package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class EnviarLoteRpsEnvio {

	@XStreamAsAttribute
	private String xmlns = "http://www.abrasf.org.br/nfse.xsd";
	
	@XStreamAsAttribute
	@XStreamAlias("xmlns:xsi")
	private String xsi = "http://www.w3.org/2001/XMLSchema-instance";
	
	@XStreamAsAttribute
	@XStreamAlias("xmlns:xsd")
	private String xsd = "http://www.w3.org/2001/XMLSchema";
	
	private LoteRps LoteRps;

	public EnviarLoteRpsEnvio() {
	}

	@Override
	public String toString() {
		return "EnviarLoteRpsEnvio [LoteRps=" + LoteRps + "]";
	}

	public void setLoteRps(LoteRps loteRps) {
		LoteRps = loteRps;		
	}

}