package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.Endereco;

public class EnderecoBuilderTest {

	EnderecoBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new EnderecoBuilder();
	}

	@Test
	public void shouldBuildEndereco() {
		assertThat(builder.build(), instanceOf(Endereco.class));
	}
	
	@Test
	public void shouldSetEndereco() {
		Endereco endereco = builder.withEndereco("end").build();
		assertThat(endereco.getEndereco(), equalTo("end"));
	}
	
	@Test
	public void shouldSetNumero() {
		Endereco endereco = builder.withNumero(1).build();
		assertThat(endereco.getNumero(), equalTo(1));
	}
	
	@Test
	public void shouldSetComplemento() {
		Endereco endereco = builder.withComplemento("com").build();
		assertThat(endereco.getComplemento(), equalTo("com"));
	}
	
	@Test
	public void shouldSetBairro() {
		Endereco endereco = builder.withBairro("ba").build();
		assertThat(endereco.getBairro(), equalTo("ba"));
	}
	
	@Test
	public void shouldSetCodigoMunicipio() {
		Endereco endereco = builder.withCodigoMunicipio(321).build();
		assertThat(endereco.getCodigoMunicipio(), equalTo(321));
	}
	
	@Test
	public void shouldSetUf() {
		Endereco endereco = builder.withUf("es").build();
		assertThat(endereco.getUf(), equalTo("es"));
	}
	
	@Test
	public void shouldSetCep() {
		Endereco endereco = builder.withCep(111).build();
		assertThat(endereco.getCep(), equalTo(111));
	}
}
