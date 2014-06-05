package br.com.flexait.nfse.converter;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EmptyConverterTest {

	EmptyConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new EmptyConverter();
	}

	@Test
	public void shoudConvertIfString() {
		assertThat(converter.canConvert(String.class), equalTo(true));
	}
	
	/*@Test
	public void shouldReturnObjectString() {
		assertThat((String)converter.fromString("foo"), equalTo("foo"));
	}
	
	@Test
	public void shouldReturnString() {
		assertThat(converter.toString("foo"), equalTo("foo"));
	}
	
	@Test
	public void shouldReturnNullIfEmpty() {
		assertThat(converter.toString(""), nullValue());
	}
	
	@Test
	public void shouldReturnNullIfNull() {
		assertThat(converter.toString(null), nullValue());
	}
*/
}
