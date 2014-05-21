package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.model.EnviarLoteRpsEnvio;
import br.com.flexait.nfse.model.LoteRps;

import com.thoughtworks.xstream.XStream;

class NfseBuilder {

	private static final String XML_VERSION_1_0_ENCODING_UTF_8 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
	private final EnviarLoteRpsEnvio enviarLoteRpsEnvio;
	private final XStream xstream;
	private LoteRps loteRps;
	
	public NfseBuilder() {
		xstream = xstream();
		enviarLoteRpsEnvio = new EnviarLoteRpsEnvio();
	}

	private XStream xstream() {
		XStream xstream = new XStream();
		xstream.alias("EnviarLoteRpsEnvio", EnviarLoteRpsEnvio.class);
		xstream.autodetectAnnotations(true);
		return xstream;
	}
	
	public String build() {
		enviarLoteRpsEnvio.setLoteRps(loteRps);
		return XML_VERSION_1_0_ENCODING_UTF_8 + xstream.toXML(enviarLoteRpsEnvio);
	}

}