package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

@XStreamConverter(EnumToStringConverter.class)
public enum Versao {
	
	V2_01("2.01"), V2_02("2.02");
	
	private String value;

	Versao(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}