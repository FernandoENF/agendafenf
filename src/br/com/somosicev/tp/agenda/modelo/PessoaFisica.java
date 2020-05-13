package br.com.somosicev.tp.agenda.modelo;

public class PessoaFisica extends Pessoa {

	private CPF cpf;
	
	@Override
	Documento getDocumento() {
		return this.cpf;
	}

	@Override
	public void setDocumento(Documento documento) {
		this.cpf = (CPF) documento;
	}

	public void coletarPessoa() {
		System.out.println("Digite o nome da pessoa: \n");
		this.setNome(coletarTexto());
		System.out
		
		
	}

}
