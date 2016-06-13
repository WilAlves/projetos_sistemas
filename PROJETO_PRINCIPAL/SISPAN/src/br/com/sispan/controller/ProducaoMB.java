package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Producao;

@ViewScoped
@ManagedBean
public class ProducaoMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8667976877645459832L;
	/**
	 * 
	 */
	private Producao producao = new Producao();
	private List<Producao> listaProducoes = new ArrayList();
	
	public Producao getProducao() {
		return producao;
	}

	public void setProducao(Producao producao) {
		this.producao = producao;
	}

	@Override
	protected Bean getBean() {
		return getProducao();
	}

	@Override
	protected void setBean(Bean b) {
		setProducao((Producao) b);
	}

	@Override
	public void setLista(List lista) {
		System.out.println("setando lista: ");
		this.listaProducoes = new ArrayList<Producao>(lista);
	}
	
		
	public List<Producao> getListaProducao() {
		return listaProducoes;
	}

	public void setListaProducao(List<Producao> listaProducao) {
		this.listaProducoes = listaProducao;
	}
}