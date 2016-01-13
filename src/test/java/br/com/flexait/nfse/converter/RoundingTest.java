package br.com.flexait.nfse.converter;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class RoundingTest {

	@Test
	public void shouldReturnHalfUp() {
		double value = round("4.975");
		assertThat(value, equalTo(4.98));
	}

	private double round(String val) {
		return new BigDecimal(val).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	@Test
	public void shouldReturnHalfUp2() {
		double value = round("1.745");
		assertThat(value, equalTo(1.75));
	}
	
	@Test
	public void shouldReturnHalfUp3() {
		double value = round("0.745");
		assertThat(value, equalTo(0.75));
	}

}
