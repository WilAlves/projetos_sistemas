package br.com.sispan.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Receita;

@RequestScoped
@ManagedBean
public class ReceitaMB extends GenericMB {

	private Receita receita = new Receita();
	
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
	public void setLista(List<Bean>lista) {
		
	}
}
