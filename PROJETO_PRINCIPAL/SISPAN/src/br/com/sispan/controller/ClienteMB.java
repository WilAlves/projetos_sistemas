package br.com.sispan.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import br.com.sispan.interfaces.Bean;
import br.com.sispan.model.Cliente;

@RequestScoped
@ManagedBean
public class ClienteMB extends GenericMB {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3293363169350986859L;
	private Cliente cliente = new Cliente();

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	
	@Override
	protected Bean getBean() { // TODO Auto-generated method stub
		return cliente;
	}

	
	@Override
	protected void setBean(Bean b) { // TODO Auto-generated method
		this.setCliente((Cliente) b);
		System.out.println("nome: "+this.cliente.getCartaoCliente());
	}

	@Override
	public void setLista(List<Bean> lista) {
		// TODO Auto-generated method stub
		
	}
	
	


	
}