package br.com.flexait.nfse.builder;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.com.flexait.nfse.model.Contato;

public class ContatoBuilderTest {

	private static final String EMAIL = "email@email.com";
	private static final String TELEFONE = "2799999999";
	ContatoBuilder builder;
	
	@Before
	public void setUp() throws Exception {
		builder = new ContatoBuilder();
	}

	@Test
	public void shouldSetTelefone() {
		Contato contato = builder.withTelefone(TELEFONE).build();
		assertThat(contato.getTelefone(), equalTo(TELEFONE));
	}
	
	@Test
	public void shouldSetEmail() {
		Contato contato = builder.withEmail(EMAIL).build();
		assertThat(contato.getEmail(), equalTo(EMAIL));
	}
	
}