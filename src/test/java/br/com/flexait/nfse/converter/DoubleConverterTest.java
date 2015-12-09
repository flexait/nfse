package br.com.flexait.nfse.converter;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;

public class DoubleConverterTest {

	DoubleConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new DoubleConverter();
	}

	@Test
	public void shouldReturnDoubleFormattedWithDotInEnLocale() {
		Locale.setDefault(new Locale("en", "US"));
		assertThat(converter.toString(214.41), equalTo("214.41"));
	}
	
	@Test
	public void shouldReturnDoubleFormattedWithDotInPtLocale() {
		Locale.setDefault(new Locale("pt", "BR"));
		assertThat(converter.toString(214.41), equalTo("214.41"));
	}
	
	@Test
	public void shouldReturnDoubleFormatted2() {
		assertThat(converter.toString(214.41), equalTo("214.41"));
	}
	
	@Test
	public void shouldReturnDoubleFormatted3() {
		assertThat(converter.toString(214.4), equalTo("214.40"));
	}
	
	@Test
	public void shouldReturnDecimalRoundedToUp() {
		assertThat(converter.toString(214.441), equalTo("214.45"));
	}
	
	@Test
	public void shouldReturnDecimalRoundedToUp2() {
		assertThat(converter.toString(214.449), equalTo("214.45"));
	}
	
	@Test
	public void shouldReturnIfNull() {
		assertThat(converter.toString(null), equalTo("0.00"));
	}
	
}
