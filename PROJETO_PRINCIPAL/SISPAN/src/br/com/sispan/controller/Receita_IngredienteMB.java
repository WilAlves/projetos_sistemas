package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Receita_Ingrediente;


public class Receita_IngredienteMB extends GenericMB{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4456151681826818112L;
	private Receita_Ingrediente receitaingrediente = new Receita_Ingrediente();
	private List<Receita_Ingrediente> listaReceitasIngredientes = new ArrayList();
	
	
	
	public Receita_Ingrediente getReceitaingrediente() {
		return receitaingrediente;
	}
	public void setReceitaingrediente(Receita_Ingrediente receitaingrediente) {
		this.receitaingrediente = receitaingrediente;
	}
	public List<Receita_Ingrediente> getListaReceitasIngredientes() {
		return listaReceitasIngredientes;
	}
	public void setListaReceitasIngredientes(List<Receita_Ingrediente> listaReceitasIngredientes) {
		this.listaReceitasIngredientes = listaReceitasIngredientes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	protected Bean getBean() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	protected void setBean(Bean b) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setLista(List<Bean> lista) {
		// TODO Auto-generated method stub
		
	}
	
}
