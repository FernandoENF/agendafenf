package br.com.somosicev.tp.agenda;

import java.util.Scanner;

import br.com.somosicev.tp.agenda.modelo.CPF;
import br.com.somosicev.tp.agenda.modelo.PessoaFisica;
import br.com.somosicev.tp.agenda.modelo.db.BDPessoaFisica;
import br.com.somosicev.tp.agenda.modelo.db.BDPessoaJuridica;

public class Main {
	static BDPessoaFisica BDPF = new BDPessoaFisica();
	static BDPessoaJuridica BDPJ = new BDPessoaJuridica();

	public static void main(String[] args) {
	Menu.menuPrincipal();
	}
	
	static class Menu {
		public static void menuPrincipal() {
			System.out.println("Estamos trabalhando com pessoa física ou jurídica? \n");
			int numero = coletarOpcao();
			switch(numero) {
				case 1:
				System.out.println("***********************************************************");
				System.out.println("******************** CONTATOS (PESSOAS FÍSICAS) ***********");
				System.out.println("***********************************************************\n");
	
				System.out.println("***********************************************************");
				System.out.println("Informe a alternativa desejada referente ao menu abaixo:\n");
				System.out.println("1 - Listar os contatos");
				System.out.println("2 - Inserir novo contato");
				System.out.println("3 - Editar contato");
				System.out.println("4 - Apagar contato");
				System.out.println("5 - Apagar todos os contatos existentes");
				menuPF();
				case 2:
					System.out.println("***********************************************************");
					System.out.println("******************** CONTATOS (PESSOAS JURÍDICAS) *********");
					System.out.println("***********************************************************\n");
		
					System.out.println("***********************************************************");
					System.out.println("Informe a alternativa desejada referente ao menu abaixo:\n");
					System.out.println("1 - Listar os contatos");
					System.out.println("2 - Inserir novo contato");
					System.out.println("3 - Buscar contato");
					System.out.println("4 - Apagar contato");
					System.out.println("5 - Atualizar contato");
					menuPJ();
			}
		}
		public static void menuPF() {
			int numero = coletarOpcao();
			switch (numero) {
			case 1:
				
			case 2:
				PessoaFisica p = new PessoaFisica();
				p.coletarPessoa();
				BDPF.adicionar(p);
				menuPrincipal();
			case 3:
				System.out.println("Digite o CPF da pessoa que você deseja buscar: \n");
				PessoaFisica p2 = new PessoaFisica();
				p2.setDocumento(new CPF(coletarTexto()));
				BDPF.buscar(p2);
				menuPrincipal();
			case 4:
				menuPrincipal();
			case 5:
				menuPrincipal();
			}
		}
		public static void menuPJ() {
			
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
}
