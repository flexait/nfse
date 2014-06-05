package br.com.flexait.nfse.converter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thoughtworks.xstream.converters.basic.StringConverter;

public class EmptyConverter extends StringConverter {

	private static final Logger LOG = LoggerFactory.getLogger(EmptyConverter.class);
	
	@Override
	public String toString(Object obj) {
		String str = (String) obj;
		if(str != null && str.isEmpty()) {
			LOG.info("Empty string ignored");
			
			return "n/a";
		}
		return super.toString(obj);
	}

}
