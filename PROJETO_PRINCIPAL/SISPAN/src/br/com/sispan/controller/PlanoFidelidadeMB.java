package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.PlanoFidelidade;
import br.com.sispan.model.Produto;

@ViewScoped
@ManagedBean
public class PlanoFidelidadeMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6907589437151369582L;
	private PlanoFidelidade planoFidelidade = new PlanoFidelidade();
	private List<PlanoFidelidade> listaPlanos = new ArrayList();

	public PlanoFidelidade getPlanoFidelidade() {
		return planoFidelidade;
	}

	public void setPlanoFidelidade(PlanoFidelidade planoFidelidade) {
		this.planoFidelidade = planoFidelidade;
	}

	@Override
	protected Bean getBean() {
		return getPlanoFidelidade();
	}

	@Override
	protected void setBean(Bean b) {
		setPlanoFidelidade((PlanoFidelidade) b);
	}

	@Override
	public void setLista(List lista) {
		this.listaPlanos = new ArrayList<PlanoFidelidade>(lista);
	}

	public List<PlanoFidelidade> getListaPlanos() {
		return listaPlanos;
	}

	public void setListaPlanos(List<PlanoFidelidade> listaPlanos) {
		this.listaPlanos = listaPlanos;
	}

	public List<PlanoFidelidade> autoCompletePlanoFidelidade(String nome) {
		List<PlanoFidelidade> result = new ArrayList<PlanoFidelidade>();
		for (PlanoFidelidade p : listaPlanos) {
			if (p.getNomePlano().toUpperCase().contains(nome.toUpperCase())) {
				result.add(p);
			}
		}
		return result;
	}
	
	public void onItemSelect(SelectEvent event) {
		List lista = this.planoFidelidade.getListaPremiacoes();
		Produto p = (Produto) event.getObject();
		if(!lista.contains(p)){
			lista.add(p);
		}	 	
	} 
}
