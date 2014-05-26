package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.LoteRps;
import br.com.flexait.nfse.model.Status;
import br.com.flexait.nfse.model.Versao;

public class LoteNfseBuilderTest {

	LoteNfseBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new LoteNfseBuilder();
	}

	@Test
	public void shouldInstanceABuilder() {
		assertThat(builder, notNullValue());
	}
	
	@Test
	public void shouldReturnAXmlEnviarLote() {
		LoteRps lote = builder.build();
		assertThat(lote, instanceOf(LoteRps.class));	
	}
	
	@Test
	public void shouldSetIdLote() {
		LoteRps lote = builder.withIdLote("foo").build();
		assertThat(lote.getId(), equalTo("foo"));	
	}
	
	@Test
	public void shouldSetDefaultVersion2_01() {
		LoteRps lote = builder.build();
		assertThat(lote.getVersao(), equalTo(Versao.V2_01));
	}
	
	@Test
	public void shouldSetVersion2_01() {
		LoteRps lote = builder.v2_01().build();
		assertThat(lote.getVersao(), equalTo(Versao.V2_01));
	}
	
	@Test
	public void shouldSetVersion2_02() {
		LoteRps lote = builder.v2_02().build();
		assertThat(lote.getVersao(), equalTo(Versao.V2_02));
	}
	
	@Test
	public void shouldSetCnpj() {
		LoteRps loteRps = builder.withCnpj("123").build();
		assertThat(loteRps.getCpfCnpj().getCnpj(), equalTo("123"));
	}
	
	@Test
	public void shouldSetInscricaoMunicipal() {
		LoteRps loteRps = builder.withInscricaoMunicipal(31313L).build();
		assertThat(loteRps.getInscricaoMunicipal(), equalTo(31313L));
	}
	
	@Test
	public void shouldSetNumeroLote() {
		LoteRps loteRps = builder.withNumeroLote(10L).build();
		assertThat(loteRps.getNumeroLote(), equalTo(10L));
	}
	
	@Test
	public void shouldAddRps() {
		LoteRps loteRps = builder.addRps(new RpsBuilder().cancelado().build()).build();
		assertThat(loteRps, notNullValue());
		assertThat(loteRps.getRps().get(0).getInfDeclaracaoPrestacaoServico().getRps().getStatus(), equalTo(Status.CANCELADO));
		assertThat(loteRps.getQuantidadeRps(), equalTo(1));
	}
	
}