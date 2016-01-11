package br.com.flexait.nfse.converter;

public class DoubleConverter extends com.thoughtworks.xstream.converters.basic.DoubleConverter {

	@Override
	public String toString(Object obj) {
		return new Rounding((Double) obj).valueFormatted();
	}

}
