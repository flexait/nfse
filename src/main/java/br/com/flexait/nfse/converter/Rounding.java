package br.com.flexait.nfse.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Rounding {

	private final Double value;

	public Rounding(Double value) {
		this.value = value == null ? 0.0 : value;
	}

	public double valueDouble() {
		return getRounded();
	}
	
	public String valueFormatted() {
		DecimalFormat format = decimalFormat();
		return format.format(getRounded());
	}

	private Double getRounded() {
		String toStringForPrecision = String.valueOf(value);
		BigDecimal bd = new BigDecimal(toStringForPrecision).setScale(2, BigDecimal.ROUND_HALF_UP);
		return bd.doubleValue();
	}
	
	private DecimalFormat decimalFormat() {
		DecimalFormat format = new DecimalFormat("#0.00");
		format.setDecimalFormatSymbols(symbols());
		format.setRoundingMode(RoundingMode.HALF_UP);
		return format;
	}

	private DecimalFormatSymbols symbols() {
		DecimalFormatSymbols newSymbols = new DecimalFormatSymbols();
		newSymbols.setDecimalSeparator('.');
		return newSymbols;
	}
	
	
}
