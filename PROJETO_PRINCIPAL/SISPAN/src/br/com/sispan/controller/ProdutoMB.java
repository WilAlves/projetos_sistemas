package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
<<<<<<< 4c673af79553dec6f792a3bc115b29a377e2bb17
=======

>>>>>>> 
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Produto;

@ViewScoped
@ManagedBean
public class ProdutoMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4310578030962777015L;
	private Produto produto = new Produto();
	private List<Produto> listaProdutos = new ArrayList<Produto>();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
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
		this.listaProdutos = new ArrayList<Produto>(lista);
	}

	 
	
	public List<Produto> autoCompleteProdutos(String nome) {
		List<Produto> result = new ArrayList<Produto>();
		for (Produto p : listaProdutos) {
			if (p.getDescricao().toUpperCase().contains(nome.toUpperCase())) {
				result.add(p);
			}
		}
		return result;
	}

}
