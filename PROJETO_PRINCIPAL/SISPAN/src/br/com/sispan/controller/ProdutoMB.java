package br.com.sispan.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.view.ViewScoped;
import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Produto;

@ViewScoped
@RequestScoped
@ManagedBean
public class ProdutoMB extends GenericMB {

	private Produto produto = new Produto();
		
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
	
	


}
