package br.com.flexait.nfse.converter;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class DoubleConverter extends com.thoughtworks.xstream.converters.basic.DoubleConverter {

	@Override
	public String toString(Object obj) {
		if(obj == null) {
			return "0.00";
		}
		DecimalFormat format = decimalFormat();
		
		return format.format(obj);
	}

	private DecimalFormat decimalFormat() {
		DecimalFormat format = new DecimalFormat("#0.00");
		format.setDecimalFormatSymbols(symbols());
		format.setRoundingMode(RoundingMode.CEILING);
		return format;
	}

	private DecimalFormatSymbols symbols() {
		DecimalFormatSymbols newSymbols = new DecimalFormatSymbols();
		newSymbols.setDecimalSeparator('.');
		return newSymbols;
	}
	
}
