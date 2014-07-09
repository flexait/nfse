package br.com.flexait.nfse.converter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class DateConverter implements SingleValueConverter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public boolean canConvert(Class type) {
		return type.isAssignableFrom(GregorianCalendar.class);
	}

	private String getConverted(Calendar source) {
		if(source == null) {
			throw new IllegalArgumentException("Date not be null");
		}
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(source.getTime());
	}

	@Override
	public String toString(Object obj) {
		return getConverted((Calendar)obj);
	}

	@Override
	public Object fromString(String str) {
		return null;
	}

}
