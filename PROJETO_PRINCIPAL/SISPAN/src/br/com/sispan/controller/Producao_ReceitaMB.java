package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Producao_Receita;

public class Producao_ReceitaMB extends GenericMB{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Producao_Receita producao_receita = new Producao_Receita();
	private List<Producao_Receita> listaProducoesReceitas = new ArrayList();
	
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
	public Producao_Receita getProducao_receita() {
		return producao_receita;
	}
	public void setProducao_receita(Producao_Receita producao_receita) {
		this.producao_receita = producao_receita;
	}
	public List<Producao_Receita> getListaProducoesReceitas() {
		return listaProducoesReceitas;
	}
	public void setListaProducoesReceitas(List<Producao_Receita> listaProducoesReceitas) {
		this.listaProducoesReceitas = listaProducoesReceitas;
	}
	
	

}
