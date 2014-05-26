package br.com.flexait.nfse.converter;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoubleConverterTest {

	DoubleConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new DoubleConverter();
	}

	@Test
	public void shouldReturnDoubleFormatted() {
		assertThat(converter.toString(10.1045), equalTo("10.10"));
	}
	
	@Test
	public void shouldReturnIfNull() {
		assertThat(converter.toString(null), equalTo("0.00"));
	}

}
