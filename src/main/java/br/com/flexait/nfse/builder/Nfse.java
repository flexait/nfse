package br.com.flexait.nfse.builder;

import br.com.flexait.nfse.NfseException;
import br.com.flexait.nfse.model.EnviarLoteRpsEnvio;
import br.com.flexait.nfse.model.LoteRps;
import br.com.flexait.nfse.validation.NfseValidator;

import com.thoughtworks.xstream.XStream;

public class Nfse {

	private static final String XML_HEADER = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n";
	private final XStream xstream;
	private final EnviarLoteRpsEnvio enviarLoteRpsEnvio;
	private boolean enableValidation;

	protected Nfse() {
		xstream = xstream();
		enviarLoteRpsEnvio = new EnviarLoteRpsEnvio();
		enableValidation = true;
	}

	private XStream xstream() {
		XStream xstream = new XStream();
		xstream.alias("EnviarLoteRpsEnvio", EnviarLoteRpsEnvio.class);
		xstream.autodetectAnnotations(true);
		return xstream;
	}

	public static Nfse nfse() {
		return new Nfse();
	}

	public String asXML() throws NfseException {
		String xml = XML_HEADER	+ xstream.toXML(enviarLoteRpsEnvio);
		if(enableValidation) {
			try {
				Nfse.validator().from(xml).validate();
			} catch (Exception e) {
				throw new NfseException(e);
			}
		}
		return xml;
	}

	public static RpsBuilder rps() {
		return new RpsBuilder();
	}

	public static LoteNfseBuilder loteNfse() {
		return new LoteNfseBuilder();
	}

	public Nfse withLoteRps(LoteRps loteRps) {
		enviarLoteRpsEnvio.setLoteRps(loteRps);
		return this;
	}

	public static NfseValidator validator() {
		return new NfseValidator();
	}

	public Nfse disableValidation() {
		this.enableValidation = false;
		return this;
	}
	
}