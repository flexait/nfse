package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class NfseTest {

	Nfse nfse;
	
	@Before
	public void setUp() throws Exception {
		nfse = Nfse.build();
	}

	@Test
	public void shouldReturnNfseBuilder() {
		assertThat(nfse, notNullValue());
	}
	
	@Test
	public void shouldReturnXml() {
		assertThat(nfse.asXML(), containsString("<?xml"));
		assertThat(nfse.asXML(), containsString("<EnviarLoteRpsEnvio xmlns="));
		assertThat(nfse.asXML(), containsString("<LoteRps Id="));
	}
	
	@Test
	public void shouldSetIdLote() {
		assertThat(nfse.withLoteId("foo").asXML(), containsString("<LoteRps Id=\"foo"));
	}
	
	@Test
	public void shouldSetCnpj() {
		assertThat(nfse.withCnpj("123").asXML(), containsString("<Cnpj>123</Cnpj>"));
	}
	
	@Test
	public void shouldSetInscricaoMunicipal() {
		assertThat(nfse.withInscricaoMunicipal("31313").asXML(), containsString("<InscricaoMunicipal>31313</InscricaoMunicipal>"));
	}
	
	@Test
	public void shouldSetNumeroLote() {
		assertThat(nfse.withNumeroLote(10L).asXML(), containsString("<NumeroLote>10</NumeroLote>"));
	}
	
	@Test
	public void shouldSetDefaultVersao() {
		assertThat(nfse.asXML(), containsString("versao=\"2.01"));
	}
	
	@Test
	public void shouldSetVersao2_02() {
		assertThat(nfse.v2_02().asXML(), containsString("versao=\"2.02"));
	}
	
	@Test
	public void shouldSetVersao2_01() {
		assertThat(nfse.v2_01().asXML(), containsString("versao=\"2.01"));
	}
	
	@Test
	public void shouldReturnRpsBuilder() {
		assertThat(nfse.rps(), instanceOf(RpsBuilder.class));
	}
	
	@Test
	public void shouldAddRps() {
		
	}
}
