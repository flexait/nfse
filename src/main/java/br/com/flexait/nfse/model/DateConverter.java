package br.com.flexait.nfse.model;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

public class DateConverter implements Converter {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public boolean canConvert(Class type) {
		return type.isAssignableFrom(GregorianCalendar.class);
	}

	public void marshal(Object source, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		String converted = getConverted((GregorianCalendar)source);
		writer.setValue(converted);
	}

	private String getConverted(GregorianCalendar source) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return format.format(source.getTime());
	}

	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		return null;
	}

}
