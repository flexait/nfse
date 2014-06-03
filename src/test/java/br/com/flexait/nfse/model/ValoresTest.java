package br.com.flexait.nfse.model;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {

	Valores valores;
	
	@Before
	public void setUp() {
		valores = new Valores();
	}
	
	@Test
	public void shouldCalculateValorIssWhenSetAliquota() {
		valores.setValorServicos(10.0);
		valores.setAliquota(2.0);
		
		assertThat(valores.getValorIss(), equalTo(0.2));
	}
	
	@Test
	public void shouldCalculateValorIssWhenSetValorServicos() {
		valores.setAliquota(2.0);
		valores.setValorServicos(10.0);
		
		assertThat(valores.getValorIss(), equalTo(0.2));
	}

}
