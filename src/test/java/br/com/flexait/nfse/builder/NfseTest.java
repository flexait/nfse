package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.NfseException;
import br.com.flexait.nfse.model.LoteRps;

public class NfseTest {

	Nfse builder;

	@Before
	public void setUp() throws Exception {
		builder = Nfse.nfse();
	}

	@Test
	public void shouldReturnNfseBuilder() {
		assertThat(builder, notNullValue());
	}

	@Test
	public void shouldReturnXml() throws Exception {
		builder = builder.withLoteRps(new LoteNfseBuilder().build()).disableValidation();
		assertThat(builder.asXML(), containsString("<?xml"));
		assertThat(builder.asXML(),
				containsString("<EnviarLoteRpsEnvio xmlns="));
		assertThat(builder.asXML(), containsString("<LoteRps Id="));
	}

	@Test
	public void shouldReturnRpsBuilder() {
		assertThat(Nfse.rps(), instanceOf(RpsBuilder.class));
	}

	@Test
	public void shouldReturnAXmlEnviarLote() throws Exception {
		String xml = builder.disableValidation().asXML();
		assertThat(xml, containsString("<EnviarLoteRpsEnvio"));
	}

	@Test
	public void shouldAddXmlHeader() throws Exception {
		String xml = builder.disableValidation().asXML();
		assertThat(xml, containsString("<?xml"));
	}

	@Test
	public void shouldAddLoteRps() throws Exception {
		LoteRps lote = Nfse.loteNfse().withCnpj("123").build();
		Nfse nfse = builder.disableValidation().withLoteRps(lote);

		assertThat(nfse.asXML(), containsString("<Cnpj>123</Cnpj>"));
	}

	@Test
	public void shouldAddRps() throws Exception {
		LoteRps lote = Nfse.loteNfse().withCnpj("123")
				.addRps(Nfse.rps().cancelado().build()).build();
		Nfse nfse = builder.withLoteRps(lote).disableValidation();

		assertThat(nfse.asXML(), containsString("<Status>2</Status>"));
		assertThat(nfse.asXML(), containsString("<QuantidadeRps>1</QuantidadeRps>"));
	}
	
	@Test(expected = NfseException.class)
	public void xmlShouldBeInvalid() throws Exception {
		Nfse.nfse().asXML();
	}
	
	@Test
	public void shouldDisableValidation() throws Exception {
		Nfse.nfse().disableValidation().asXML();
	}
	
	@Test
	public void shouldCreateAValidXml() throws Exception {
		LoteRps lote = Nfse.loteNfse()
				.withCnpj("00000000000000")
				.withNumeroLote(123123L)
				.addRps(
						Nfse.rps()
						.withNumero(1L)
						.withInfId("d")
						.build()
				)
				.build();
		Nfse nfse = builder.withLoteRps(lote);
		String asXML = nfse.asXML();
		System.out.println(asXML);
	}
}