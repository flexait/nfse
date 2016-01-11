package br.com.flexait.nfse.model;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {

	private static final double _2_5 = 2.5;
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
	
	@Test
	public void shouldCalculateValorIssRoundingToUp() {
		valores.setAliquota(2.5);
		valores.setValorServicos(200.28);
		
		assertThat(valores.getValorIss(), equalTo(5.01));
	}
	
	@Test
	public void shouldCalculateValorIssRoundingToUp2() {
		valores.setAliquota(_2_5);
		valores.setValorServicos(200.92);
		
		assertThat(valores.getValorIss(), equalTo(5.02));
	}
	
	@Test
	public void shouldCalculateValorIssRoundingToUp3() {
		valores.setAliquota(_2_5);
		valores.setValorServicos(210.82);
		
		assertThat(valores.getValorIss(), equalTo(5.27));
	}
	
	@Test
	public void shouldCalculateValorIssRoundingToUp4() {
		valores.setAliquota(_2_5);
		valores.setValorServicos(125.0);
		
		assertThat(valores.getValorIss(), equalTo(3.13));
	}

}
