package br.com.somosicev.tp.agenda.modelo.db;

import java.util.Iterator;
import java.util.List;

import br.com.somosicev.tp.agenda.modelo.Pessoa;
import br.com.somosicev.tp.agenda.modelo.PessoaJuridica;

public class BDPessoaJuridica extends BD{
	
	private List<PessoaJuridica> cadastrosPJ;

	@Override
	public Pessoa buscar(Pessoa p) {
		Iterator<PessoaJuridica> iterator = this.cadastrosPJ.iterator();
		while (iterator.hasNext()) {;
		    if (iterator.next().equals(p)) {
		    	return p;
		    } else {
			continue;
		    }
		}
		return null;
	}

	@Override
	public void adicionar(Pessoa nova) {
		this.cadastrosPJ.add((PessoaJuridica) nova);
		
	}

	@Override
	public void remover(Pessoa velha) {
		int v = this.cadastrosPJ.indexOf(velha);
		this.cadastrosPJ.remove(v);
	}
	

}
