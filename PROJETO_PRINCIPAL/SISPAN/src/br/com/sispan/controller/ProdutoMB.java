package br.com.sispan.controller;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Produto;

@ViewScoped
@ManagedBean
public class ProdutoMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5614961461170613159L;
	private Produto produto = new Produto();
	private List<Produto> listaProdutos = new ArrayList();
		
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	protected Bean getBean() {	 
		return getProduto();
	}

	@Override
	protected void setBean(Bean b) {
		setProduto((Produto) b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("setando lista: ");
		this.listaProdutos = new ArrayList<Produto>(lista);
	}
	
		
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
