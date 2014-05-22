package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.ExigibilidadeISS;
import br.com.flexait.nfse.model.Servico;
import br.com.flexait.nfse.model.SimNao;

public class ServicoBuilderTest {

	ServicoBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new ServicoBuilder();
	}

	@Test
	public void shouldSetValorServicos() {
		Servico servico = builder.withValorServicos(11.0).build();
		assertThat(servico.getValores().getValorServicos(), equalTo(11.0));
	}
	
	@Test
	public void shouldSetValorPis() {
		Servico servico = builder.withValorPis(12.0).build();
		assertThat(servico.getValores().getValorPis(), equalTo(12.0));
	}
	
	@Test
	public void shouldSetValorCofins() {
		Servico servico = builder.withValorCofins(10.0).build();
		assertThat(servico.getValores().getValorCofins(), equalTo(10.0));
	}
	
	@Test
	public void shouldSetValorInss() {
		Servico servico = builder.withValorInss(9.0).build();
		assertThat(servico.getValores().getValorInss(), equalTo(9.0));
	}
	
	@Test
	public void shouldSetValorIr() {
		Servico servico = builder.withValorIr(8.0).build();
		assertThat(servico.getValores().getValorIr(), equalTo(8.0));
	}
	
	@Test
	public void shouldSetOutrasRetencoes() {
		Servico servico = builder.withOutrasRetencoes(7.0).build();
		assertThat(servico.getValores().getOutrasRetencoes(), equalTo(7.0));
	}
	
	@Test
	public void shouldSetValorCsll() {
		Servico servico = builder.withValorCsll(6.0).build();
		assertThat(servico.getValores().getValorCsll(), equalTo(6.0));
	}
	@Test
	public void shouldSetValorIss() {
		Servico servico = builder.withValorIss(5.0).build();
		assertThat(servico.getValores().getValorIss(), equalTo(5.0));
	}
	
	@Test
	public void shouldSetAliquota() {
		Servico servico = builder.withAliquota(4.0).build();
		assertThat(servico.getValores().getAliquota(), equalTo(4.0));
	}
	
	@Test
	public void shouldSetDescontoIncondicionado() {
		Servico servico = builder.withDescontoIncondicionado(10.0).build();
		assertThat(servico.getValores().getDescontoIncondicionado(), equalTo(10.0));
	}
	
	@Test
	public void shouldSetDescontoCondicionado() {
		Servico servico = builder.withDescontoCondicionado(3.0).build();
		assertThat(servico.getValores().getDescontoCondicionado(), equalTo(3.0));
	}
	
	@Test
	public void shouldSetIssRetido() {
		Servico servico = builder.issRetido().build();
		assertThat(servico.getIssRetido(), equalTo(SimNao.SIM));
	}
	
	@Test
	public void shouldSetIssNaoRetido() {
		Servico servico = builder.issNaoRetido().build();
		assertThat(servico.getIssRetido(), equalTo(SimNao.NAO));
	}
	
	@Test
	public void shouldSetDefaultIssRetido() {
		Servico servico = builder.build();
		assertThat(servico.getIssRetido(), equalTo(SimNao.NAO));
	}
	
	@Test
	public void shouldSetItemListaServico() {
		Servico servico = builder.withItemListaServico("foo").build();
		assertThat(servico.getItemListaServico(), equalTo("foo"));
	}
	
	@Test
	public void shouldSetCodigoCnae() {
		Servico servico = builder.withCodigoCnae(222).build();
		assertThat(servico.getCodigoCnae(), equalTo(222));
	}
	
	@Test
	public void shouldSetCodigoMunicipio() {
		Servico servico = builder.withCodigoMunicipio(123).build();
		assertThat(servico.getCodigoMunicipio(), equalTo(123));
	}
	
	@Test
	public void shouldSetExigibilidadeISS() {
		Servico servico = builder.withExigibilidadeISS(ExigibilidadeISS.EXIGIVEL).build();
		assertThat(servico.getExigibilidadeISS(), equalTo(ExigibilidadeISS.EXIGIVEL));
	}
	
	@Test
	public void shouldSetMunicipioIncidencia() {
		Servico servico = builder.withMunicipioIncidencia(111).build();
		assertThat(servico.getMunicipioIncidencia(), equalTo(111));
	}
	
	@Test
	public void shouldSetDiscriminacao() {
		Servico servico = builder.withDiscriminacao("1").build();
		assertThat(servico.getDiscriminacao(), equalTo("1"));
	}
}