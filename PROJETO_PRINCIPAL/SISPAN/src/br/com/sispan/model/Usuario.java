package br.com.sispan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.sispan.interfaces.Bean;

@Entity
@Table
public class Usuario implements Bean {	
	/**
	 * 
	 */
	private static final long serialVersionUID = -478153217057072509L;

	@Id
	@GeneratedValue
	@Column(name="id_usuario")
	private Long id;
	@Column(name="nome_usuario")
	private String nomeUsuario;
	@Column(name="senha_usuario")
	private String senhaUsuario;
	
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	
}
