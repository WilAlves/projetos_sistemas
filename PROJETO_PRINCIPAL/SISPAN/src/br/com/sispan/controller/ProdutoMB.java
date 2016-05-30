package br.com.sispan.controller;

<<<<<<< ec6e90cc22719936207bc2d576b2df7d9046ef77

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Produto;;

@ViewScoped
=======
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Produto;

>>>>>>> Produto inserir
@RequestScoped
@ManagedBean
public class ProdutoMB extends GenericMB {

<<<<<<< ec6e90cc22719936207bc2d576b2df7d9046ef77
	/**
	 * 
	 */
	private static final long serialVersionUID = -5614961461170613159L;
	private Produto produto = new Produto();
	private List<Produto> listaProdutos = new ArrayList();
=======
	private Produto produto = new Produto();
>>>>>>> Produto inserir
		
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
<<<<<<< ec6e90cc22719936207bc2d576b2df7d9046ef77
	
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

=======
>>>>>>> Produto inserir

}
