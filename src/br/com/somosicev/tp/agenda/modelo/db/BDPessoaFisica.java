package br.com.somosicev.tp.agenda.modelo.db;

import java.util.Iterator;
import java.util.List;

import br.com.somosicev.tp.agenda.modelo.Pessoa;

public class BDPessoaFisica extends BD {
	
	private List<Pessoa> contatos;

	@Override
	public Pessoa buscar(Pessoa p) {
		Iterator<Pessoa> iterator = this.contatos.iterator();
		while (iterator.hasNext()) {
		    if (iterator.next().equals(p)) {
		    	return p;
		    } else {
			continue;
		    }
		}
		return null;
	}

	public void listarTodos() {
		Iterator<Pessoa> iterator = this.contatos.iterator();
		while (iterator.hasNext()) {
			println(iterator.nome);
		}
		return null;
	}
	}
	@Override
	public void adicionar(Pessoa nova) {
		this.contatos.add(nova);
	}

	@Override
	public void remover(Pessoa velha) {
		int v = this.contatos.indexOf(velha);
		this.contatos.remove(v);
	}
	
}
