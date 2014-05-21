package br.com.flexait.nfse.model;


public class Rps {
	
	private InfDeclaracaoPrestacaoServico InfDeclaracaoPrestacaoServico;

	public Rps() {
		InfDeclaracaoPrestacaoServico = new InfDeclaracaoPrestacaoServico();
	}

	@Override
	public String toString() {
		return "Rps [InfDeclaracaoPrestacaoServico="
				+ InfDeclaracaoPrestacaoServico + "]";
	}

	public InfDeclaracaoPrestacaoServico getInfDeclaracaoPrestacaoServico() {
		return InfDeclaracaoPrestacaoServico;
	}

	public void setInfDeclaracaoPrestacaoServico(
			InfDeclaracaoPrestacaoServico infDeclaracaoPrestacaoServico) {
		InfDeclaracaoPrestacaoServico = infDeclaracaoPrestacaoServico;
	}

}
