package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name="cartao_cliente", nullable = false, length = 16, unique = true)
	private String cartaoCliente;
	
	@Column(name="validadecartao_cliente", nullable = false, length = 10, unique = true)
	private String validadecartaoCliente;
	
	@Column(name="codcartao_cliente", nullable = false, length = 3, unique = true)
	private String codcartaoCliente;

	@ManyToOne
	@JoinColumn(name="id_plano")
	private PlanoFidelidade plano;
	
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

	public PlanoFidelidade getPlano() {
		return plano;
	}

	public void setPlano(PlanoFidelidade plano) {
		this.plano = plano;
	}
}
