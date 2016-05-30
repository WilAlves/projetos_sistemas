package br.com.sispan.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Fornecedor;

@RequestScoped
@ManagedBean
public class FornecedorMB extends GenericMB {

	private Fornecedor fornecedor = new Fornecedor();
		
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

}
