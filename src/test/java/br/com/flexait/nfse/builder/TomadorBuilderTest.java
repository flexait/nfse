package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.Endereco;
import br.com.flexait.nfse.model.Tomador;

public class TomadorBuilderTest {

	TomadorBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new TomadorBuilder();
	}

	@Test
	public void shouldBuildTomador() {
		assertThat(builder.build(), instanceOf(Tomador.class));
	}

	@Test
	public void shouldSetCpf() {
		Tomador tomador = builder.withCpf("123").build();
		assertThat(tomador.getIdentificacaoTomador().getCpfCnpj().getCpf(), equalTo("123"));
	}
	
	@Test
	public void shouldSetEndereco() {
		Endereco endereco = new Endereco();
		Tomador tomador = builder.withEndereco(endereco).build();
		assertThat(tomador.getEndereco(), equalTo(endereco));
	}
	
	@Test
	public void shouldSetRazaoSocial() {
		Tomador tomador = builder.withRazaoSocial("foo").build();
		assertThat(tomador.getRazaoSocial(), equalTo("foo"));
	}
}
