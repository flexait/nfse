package br.com.flexait.nfse.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.flexait.nfse.converter.EmptyConverter;
import br.com.flexait.nfse.exception.NfseException;
import br.com.flexait.nfse.model.EnviarLoteRpsEnvio;
import br.com.flexait.nfse.model.LoteRps;
import br.com.flexait.nfse.validation.NfseValidator;

import com.thoughtworks.xstream.XStream;

public class Nfse {

	private static final Logger LOG = LoggerFactory.getLogger(Nfse.class);
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
		xstream.setMode(XStream.NO_REFERENCES);
		xstream.registerConverter(new EmptyConverter());
		
		xstream.autodetectAnnotations(true);
		return xstream;
	}

	public static Nfse nfse() {
		return new Nfse();
	}

	public String asXML() throws Exception {
		String xml = XML_HEADER	+ xstream.toXML(enviarLoteRpsEnvio);
		
		LOG.debug("Validation enabled? {}", enableValidation);
		
		LOG.debug("XML:\n{}", xml);
		
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

	public static ServicoBuilder servico() {
		return new ServicoBuilder();
	}

	public static PrestadorBuilder prestador() {
		return new PrestadorBuilder();
	}

	public static TomadorBuilder tomador() {
		return new TomadorBuilder();
	}

	public static EnderecoBuilder endereco() {
		return new EnderecoBuilder();
	}
	
}