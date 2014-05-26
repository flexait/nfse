package br.com.flexait.nfse.converter;

import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.converter.DateConverter;
import br.com.flexait.nfse.model.Rps;

public class DateConverterTest {

	DateConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new DateConverter();
	}

	@Test
	public void shouldConvertIfCalendar() {
		boolean canConvert = converter.canConvert(Calendar.class);
		assertThat(canConvert, equalTo(true));
	}
	
	@Test
	public void shouldNotConvertIfOtherType() {
		boolean canConvert = converter.canConvert(Rps.class);
		assertThat(canConvert, equalTo(false));
	}
	
	@Test
	public void shouldConvert() {
		Calendar calendar = Calendar.getInstance();
		int operand = calendar.get(Calendar.DAY_OF_MONTH);
		assertThat(converter.toString(calendar), endsWith(String.valueOf(operand)));
	}

}