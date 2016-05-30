package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table

public class Cliente implements Bean {
	
	private static final long serialVersionUID = -478153217057072509L;
	
	@Id
	@GeneratedValue
	@Column(name="id_cliente")
	private Long id;
	
	@Column(name="cartao_cliente")
	private String cartaoCliente;
	
	@Column(name="validadecartao_cliente")
	private String validadecartaoCliente;
	
	@Column(name="codcartao_cliente")
	private String codcartaoCliente;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCartaoCliente() {
		return cartaoCliente;
	}

	public void setCartaoCliente(String cartaoCliente) {
		this.cartaoCliente = cartaoCliente;
	}

	public String getValidadecartaoCliente() {
		return validadecartaoCliente;
	}

	public void setValidadecartaoCliente(String validadecartaoCliente) {
		this.validadecartaoCliente = validadecartaoCliente;
	}

	public String getCodcartaoCliente() {
		return codcartaoCliente;
	}

	public void setCodcartaoCliente(String codcartaoCliente) {
		this.codcartaoCliente = codcartaoCliente;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	

	
	
}