package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Receita;

@ViewScoped
@ManagedBean
public class ReceitaMB extends GenericMB {

	private static final long serialVersionUID = 6907589437151369582L;
	private Receita receita = new Receita();
	private List<Receita> listaReceitas = new ArrayList();
	
	public Receita getReceita() {
		return receita;
	}

	public void setReceita(Receita receita) {
		this.receita = receita;
	}

	@Override
	protected Bean getBean() {	 
		return getReceita();
	}

	@Override
	protected void setBean(Bean b) {
		setReceita((Receita)b);
	}
	@Override
	public void setLista(List lista) {
		System.out.println("setando lista: ");
		this.listaReceitas = new ArrayList<Receita>(lista);
	}
	
		
	public List<Receita> getListaPlanos() {
		return listaReceitas;
	}

	public void setListaPlanos(List<Receita> listaPlanos) {
		this.listaReceitas = listaPlanos;
	}
}
