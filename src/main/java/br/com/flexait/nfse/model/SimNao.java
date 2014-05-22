package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

@XStreamConverter(value = EnumToStringConverter.class)
public enum SimNao {
	
	SIM(1), NAO(2);
	
	private int value;

	SimNao(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
