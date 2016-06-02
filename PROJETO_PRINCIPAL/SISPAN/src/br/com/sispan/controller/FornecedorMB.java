package br.com.sispan.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Fornecedor;

@RequestScoped
@ManagedBean
public class FornecedorMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7092805828495453883L;
	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> listaFornecedores = new ArrayList();
		
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	protected Bean getBean() {	 
		return getFornecedor();
	}

	@Override
	protected void setBean(Bean b) {
		setFornecedor((Fornecedor) b);
	}
	
	@Override
	public void setLista(List lista) {
		System.out.println("setando lista: ");
		this.listaFornecedores = new ArrayList<Fornecedor>(lista);
	}
	
		
	public List<Fornecedor> getListaFornecedores() {
		return listaFornecedores;
	}

	public void setListaFornecedores(List<Fornecedor> listaFornecedores) {
		this.listaFornecedores = listaFornecedores;
	}

}
