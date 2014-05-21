package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

@XStreamConverter(value = EnumToStringConverter.class)
public enum Tipo {
	
	RPS(1), MISTA(2), CUPOM(3);
	
	private int value;

	Tipo(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
