package br.com.flexait.nfse.model;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class LoteRpsTest {

	LoteRps lote;
	
	@Before
	public void setUp() throws Exception {
		lote = new LoteRps();
	}

	@Test
	public void shouldSetIdOnConstruct() {
		assertThat(lote.getId().length(), equalTo(36));
	}
	
	@Test
	public void shouldSetId() {
		lote.setId("foo");
		assertThat(lote.getId(), equalTo("foo"));
	}
	
	@Test
	public void shouldSetDefaultVersion() {
		assertThat(lote.getVersao(), equalTo(Versao.V2_01));
	}
	
	@Test
	public void shouldSetVersion() {
		lote.setVersao(Versao.V2_02);
		assertThat(lote.getVersao(), equalTo(Versao.V2_02));
	}
	
	@Test
	public void shouldSetV2_02() {
		lote.setVersao(null);
		lote.v2_02();
		assertThat(lote.getVersao(), equalTo(Versao.V2_02));
	}
	
	@Test
	public void shouldSetV2_01() {
		lote.setVersao(null);
		lote.v2_01();
		assertThat(lote.getVersao(), equalTo(Versao.V2_01));
	}
}
