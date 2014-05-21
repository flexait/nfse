package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.Rps;
import br.com.flexait.nfse.model.Serie;
import br.com.flexait.nfse.model.Status;
import br.com.flexait.nfse.model.Tipo;

public class RpsBuilderTest {

	RpsBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new RpsBuilder();
	}

	@Test
	public void shouldInstanceBuilder() {
		assertThat(builder.build(), instanceOf(Rps.class));
	}
	
	@Test
	public void shouldSetRandomInfId() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getId(), notNullValue());
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getId().length(), equalTo(36));
	}
	
	@Test
	public void shouldSetInfId() {
		Rps rps = builder.withInfId("foo").build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getId(), equalTo("foo"));
	}
	
	@Test
	public void shouldSetRandomId() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getId(), notNullValue());
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getId().length(), equalTo(36));
	}
	
	@Test
	public void shouldSetId() {
		Rps rps = builder.withId("foo").build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getId(), equalTo("foo"));
	}
	
	@Test
	public void shouldSetData() {
		Calendar calendar = Calendar.getInstance();
		Rps rps = builder.withData(calendar).build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getDataEmissao(), equalTo(calendar));
	}
	
	@Test
	public void shouldSetDefaultData() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getDataEmissao(), instanceOf(Calendar.class));
	}
	
	@Test
	public void shouldSetRpsDefaultStatusNormal() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getStatus(), equalTo(Status.NORMAL));
	}
	
	@Test
	public void shouldSetRpsStatusNormal() {
		Rps rps = builder.normal().build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getStatus(), equalTo(Status.NORMAL));
	}
	
	@Test
	public void shouldSetRpsStatusCancelado() {
		Rps rps = builder.cancelado().build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getStatus(), equalTo(Status.CANCELADO));
	}
	
	@Test
	public void shouldSetNumero() {
		Rps rps = builder.withNumero(1L).build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getNumero(), equalTo(1L));
	}
	
	@Test
	public void shouldSetDefaultSerie() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getSerie(), equalTo(Serie.NFE));
	}
	
	@Test
	public void shouldSetDefaultTipo() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getTipo(), equalTo(Tipo.RPS));
	}
	
	@Test
	public void shouldSetTipoRps() {
		Rps rps = builder.tipoRps().build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getTipo(), equalTo(Tipo.RPS));
	}
	
	@Test
	public void shouldSetTipoMista() {
		Rps rps = builder.tipoMista().build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getTipo(), equalTo(Tipo.MISTA));
	}
	
	@Test
	public void shouldSetTipoCupom() {
		Rps rps = builder.tipoCupom().build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getRps().getIdentificacaoRps().getTipo(), equalTo(Tipo.CUPOM));
	}
	
	@Test
	public void shouldSetDefaultCompetencia() {
		Rps rps = builder.build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getCompetencia(), instanceOf(Calendar.class));
	}
	
	@Test
	public void shouldSetCompetencia() {
		Calendar calendar = Calendar.getInstance();
		Rps rps = builder.withCompetencia(calendar).build();
		assertThat(rps.getInfDeclaracaoPrestacaoServico().getCompetencia(), equalTo(calendar));
	}

}
