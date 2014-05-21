package br.com.flexait.nfse.model;

public enum SimNao {
	
	SIM(1), NAO(2);
	
	private int value;

	SimNao(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
