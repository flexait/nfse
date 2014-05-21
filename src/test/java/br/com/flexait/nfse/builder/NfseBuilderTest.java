package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.LoteRps;

public class NfseBuilderTest {

	NfseBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new NfseBuilder();
	}

	@Test
	public void shouldInstanceABuilder() {
		assertThat(builder, notNullValue());
	}
	
	@Test
	public void shouldReturnAXmlEnviarLote() {
		String xml = builder.build();
		assertThat(xml, containsString("<EnviarLoteRpsEnvio"));	
	}
	
	@Test
	public void shouldAddXmlHeader() {
		String xml = builder.build();
		assertThat(xml, containsString("<?xml"));
	}

	@Test
	public void shouldHaveLoteRpsNode() {
		String xml = builder
				.withLoteRps(new LoteRps())
				.build();
		assertThat(xml, containsString("<LoteRps Id="));	
	}
	
	@Test
	public void shouldHaveLoteRpsNodeWithBuilder() {
		String xml = builder
//				.withLoteRps(new LoteRpsBuilder().build())
				.build();
		assertThat(xml, containsString("<LoteRps Id="));	
	}
}