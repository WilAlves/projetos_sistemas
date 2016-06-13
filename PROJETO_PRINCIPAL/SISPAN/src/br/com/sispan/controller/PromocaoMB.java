package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.SelectEvent;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.PlanoFidelidade;
import br.com.sispan.model.Promocao;


@ViewScoped
@ManagedBean
public class PromocaoMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7098925733370087276L;
	
	private Promocao promocao = new Promocao();
	private List<Promocao>listaPromocoes = new ArrayList<Promocao>();
	
	public Promocao getPromocao() {
		return promocao;
	}

	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}

	public List<Promocao> getListaPromocoes() {
		return listaPromocoes;
	}

	public void setListaPromocoes(List<Promocao> listaPromocoes) {
		this.listaPromocoes = listaPromocoes;
	}

	@Override
	protected Bean getBean() {
		return this.promocao;
	}

	@Override
	protected void setBean(Bean b) {
		this.setPromocao((Promocao) b);
	}

	@Override
	public void setLista(List  lista) {
		this.listaPromocoes = new ArrayList<Promocao>(lista);
	}
	
	public void onItemSelect(SelectEvent event) {
		PlanoFidelidade p = (PlanoFidelidade) event.getObject();
		List<PlanoFidelidade> lista = promocao.getListaPlanos();
		if(!lista.contains(p)){
			lista.add(p);
		}else{
			System.out.println("ja presente na lista");
		}
	}

	@Override
	public void salvar() {
		for(PlanoFidelidade p : promocao.getListaPlanos()){
			p.setPromocao(promocao);
		}
		super.salvar();
	} 
	

}
