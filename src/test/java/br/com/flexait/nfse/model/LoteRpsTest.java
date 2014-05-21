package br.com.flexait.nfse.model;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

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
	public void shouldAddRps() {
		ListaRps rps = new ListaRps(null);
		lote.addRps(Arrays.asList(rps));
		assertThat(lote.getListaRps().get(0), equalTo(rps));
	}
	
	@Test
	public void shouldIncrementQuantWhenAddRps() {
		lote.addRps(Arrays.asList(new ListaRps(null)));
		assertThat(lote.getQuantidadeRps(), equalTo(1));
	}

	@Test(expected = UnsupportedOperationException.class)
	public void shouldDispatchErrorIfAddRpsInListOfGetter() {
		lote.getListaRps().add(new ListaRps(null));
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
}
