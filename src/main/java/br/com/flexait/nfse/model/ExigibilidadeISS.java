package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

@XStreamConverter(value = EnumToStringConverter.class)
public enum ExigibilidadeISS {

	EXIGIVEL(1),
	NAO_INCIDENCIA(2),
	ISENCAO(3),
	EXPORTACAO(4),
	IMUNIDADE(5),
	EXIGIBILIDADE_SUSPENSA_DECISAO_JUDICIAL(6),
	EXIGIBILIDADE_SUSPENSA_PROCESSO_ADMINISTRATIVO(7);
	
	private int value;

	ExigibilidadeISS(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}