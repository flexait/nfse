package br.com.flexait.nfse.converter;

import java.text.DecimalFormat;

public class DoubleConverter extends com.thoughtworks.xstream.converters.basic.DoubleConverter {

	@Override
	public String toString(Object obj) {
		if(obj == null) {
			return "0.00";
		}
		return new DecimalFormat("#0.00").format(obj);
	}
	
}
