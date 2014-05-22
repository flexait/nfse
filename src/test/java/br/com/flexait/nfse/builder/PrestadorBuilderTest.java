package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.Prestador;

public class PrestadorBuilderTest {

	PrestadorBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new PrestadorBuilder();
	}

	@Test
	public void shouldBuildPrestador() {
		assertThat(builder.build(), instanceOf(Prestador.class));
	}
	
	@Test
	public void shouldSetCnpj() {
		Prestador prestador = builder.withCnpj("321").build();
		assertThat(prestador.getCpfCnpj().getCnpj(), equalTo("321"));
	}

}
