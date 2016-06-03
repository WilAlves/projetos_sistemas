package br.com.sispan.controller;

import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.ManyToMany;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Ingredientes;

@RequestScoped
@ManagedBean
public class IngredientesMB extends GenericMB {

	private Ingredientes ingredientes = new Ingredientes();
	
	public Ingredientes getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Ingredientes ingredientes) {
		this.ingredientes = ingredientes;
	}

	 @ManyToMany(targetEntity = Ingredientes.class)
	   private Set ingredienteSet;
	 
	@Override
	protected Bean getBean() {	 
		return getIngredientes();
	}

	@Override
	protected void setBean(Bean b) {
		setIngredientes((Ingredientes)b);
	}

	@Override
	public void setLista(List<Bean>lista) {
		
	}
}
