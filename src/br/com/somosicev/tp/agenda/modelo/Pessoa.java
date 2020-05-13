package br.com.somosicev.tp.agenda.modelo;

import java.util.Scanner;

public abstract class Pessoa {
	
	private String nome;
	private Endereco endereco;
	private Telefone telefone;

	public Endereco getEndereco() {
		return endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	abstract Documento getDocumento();

	abstract public void setDocumento(Documento documento);
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof Pessoa)) return false;
		
		Pessoa tmp = (Pessoa) obj;
		
		if(this.getDocumento().equals(tmp.getDocumento())) return true;
		
		return false;
	}
	public static Integer coletarOpcao() {
		Scanner scan = new Scanner(System.in);
		String opcao = scan.nextLine();
		scan.close();
		return Integer.valueOf(opcao);
	}
	public static String coletarTexto() {
		Scanner scan = new Scanner(System.in);
		String texto = scan.nextLine();
		scan.close();
		return texto;
	}
}
