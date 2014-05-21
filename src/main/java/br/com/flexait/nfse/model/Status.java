package br.com.flexait.nfse.model;

import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.enums.EnumToStringConverter;

@XStreamConverter(EnumToStringConverter.class)
public enum Status {
	
	NORMAL(1), CANCELADO(2);
	
	private int value;

	Status(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
	
}
